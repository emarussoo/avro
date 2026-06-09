package org.apache.avro.data;

import org.apache.avro.Schema;
import org.junit.Test;
import org.junit.Ignore;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ISW2TimeConversionsBBTest {

  /*
   * BB1 - DateConversion su valori intorno all'epoch.
   *
   * Category partition: - Categoria: posizione rispetto all'epoch. - Classi di
   * equivalenza: 1. data precedente all'epoch; 2. data esattamente all'epoch; 3.
   * data successiva all'epoch.
   *
   * Input rappresentativi: - -1 -> 1969-12-31 - 0 -> 1970-01-01 - 1 -> 1970-01-02
   */
  @Test
  public void dateConversionShouldHandleValuesAroundEpoch() {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    assertEquals(LocalDate.of(1969, 12, 31), conversion.fromInt(-1, null, null));
    assertEquals(LocalDate.of(1970, 1, 1), conversion.fromInt(0, null, null));
    assertEquals(LocalDate.of(1970, 1, 2), conversion.fromInt(1, null, null));

    assertEquals(Integer.valueOf(-1), conversion.toInt(LocalDate.of(1969, 12, 31), null, null));
    assertEquals(Integer.valueOf(0), conversion.toInt(LocalDate.of(1970, 1, 1), null, null));
    assertEquals(Integer.valueOf(1), conversion.toInt(LocalDate.of(1970, 1, 2), null, null));
  }

  /*
   * BB2 - TimeMillisConversion sui boundary della giornata.
   *
   * Category partition: - Categoria: boundary della giornata. - Classi di
   * equivalenza: 1. inizio giornata; 2. valore intermedio; 3. fine giornata.
   *
   * Input rappresentativi: - 00:00:00.000 - 12:30:15.123 - 23:59:59.999
   */
  @Test
  public void timeMillisConversionShouldHandleDayBoundaryValues() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    LocalTime midnight = LocalTime.of(0, 0, 0, 0);
    LocalTime middleOfDay = LocalTime.of(12, 30, 15, 123_000_000);
    LocalTime endOfDay = LocalTime.of(23, 59, 59, 999_000_000);

    int expectedMidnightMillis = 0;
    int expectedMiddleMillis = (int) TimeUnit.NANOSECONDS.toMillis(middleOfDay.toNanoOfDay());
    int expectedEndMillis = (int) TimeUnit.NANOSECONDS.toMillis(endOfDay.toNanoOfDay());

    assertEquals(Integer.valueOf(expectedMidnightMillis), conversion.toInt(midnight, null, null));
    assertEquals(Integer.valueOf(expectedMiddleMillis), conversion.toInt(middleOfDay, null, null));
    assertEquals(Integer.valueOf(expectedEndMillis), conversion.toInt(endOfDay, null, null));

    assertEquals(midnight, conversion.fromInt(expectedMidnightMillis, null, null));
    assertEquals(middleOfDay, conversion.fromInt(expectedMiddleMillis, null, null));
    assertEquals(endOfDay, conversion.fromInt(expectedEndMillis, null, null));
  }

  /*
   * BB3 - TimeMicrosConversion con precisione microsecondi.
   *
   * Category partition: - Categoria: precisione temporale. - Classe di
   * equivalenza selezionata: valore rappresentabile con precisione microsecondi.
   *
   * Input rappresentativi: - 00:00:00.000000 - 12:30:15.123456 - 23:59:59.999999
   */
  @Test
  public void timeMicrosConversionShouldHandleMicrosecondPrecision() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    LocalTime midnight = LocalTime.of(0, 0, 0, 0);
    LocalTime middleOfDay = LocalTime.of(12, 30, 15, 123_456_000);
    LocalTime endOfDay = LocalTime.of(23, 59, 59, 999_999_000);

    long expectedMidnightMicros = 0L;
    long expectedMiddleMicros = TimeUnit.NANOSECONDS.toMicros(middleOfDay.toNanoOfDay());
    long expectedEndMicros = TimeUnit.NANOSECONDS.toMicros(endOfDay.toNanoOfDay());

    assertEquals(Long.valueOf(expectedMidnightMicros), conversion.toLong(midnight, null, null));
    assertEquals(Long.valueOf(expectedMiddleMicros), conversion.toLong(middleOfDay, null, null));
    assertEquals(Long.valueOf(expectedEndMicros), conversion.toLong(endOfDay, null, null));

    assertEquals(midnight, conversion.fromLong(expectedMidnightMicros, null, null));
    assertEquals(middleOfDay, conversion.fromLong(expectedMiddleMicros, null, null));
    assertEquals(endOfDay, conversion.fromLong(expectedEndMicros, null, null));
  }

  /*
   * BB4 - TimestampMillisConversion su valori intorno all'epoch.
   *
   * Category partition: - Categoria: posizione rispetto all'epoch. - Classi di
   * equivalenza: 1. timestamp precedente all'epoch; 2. timestamp esattamente
   * all'epoch; 3. timestamp successivo all'epoch.
   *
   * Input rappresentativi: - Instant.ofEpochMilli(-1) - Instant.EPOCH -
   * Instant.ofEpochMilli(1)
   */
  @Test
  public void timestampMillisConversionShouldHandleValuesAroundEpoch() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Instant beforeEpoch = Instant.ofEpochMilli(-1);
    Instant epoch = Instant.EPOCH;
    Instant afterEpoch = Instant.ofEpochMilli(1);

    assertEquals(Long.valueOf(-1L), conversion.toLong(beforeEpoch, null, null));
    assertEquals(Long.valueOf(0L), conversion.toLong(epoch, null, null));
    assertEquals(Long.valueOf(1L), conversion.toLong(afterEpoch, null, null));

    assertEquals(beforeEpoch, conversion.fromLong(-1L, null, null));
    assertEquals(epoch, conversion.fromLong(0L, null, null));
    assertEquals(afterEpoch, conversion.fromLong(1L, null, null));
  }

  /*
   * BB5 - TimestampMicrosConversion su timestamp positivo e timestamp negativo
   * frazionario.
   *
   * Category partition: - Categoria: timestamp con precisione microsecondi. -
   * Categoria: timestamp negativo con componente frazionaria positiva.
   *
   * Classi di equivalenza selezionate: 1. timestamp positivo con frazione
   * microsecondi; 2. timestamp negativo con nanos positivi.
   *
   * Input rappresentativi: - Instant.ofEpochSecond(1, 123456000) -> 1_123_456
   * microsecondi - Instant.ofEpochSecond(-1, 500000000) -> -500_000 microsecondi
   */
  @Test
  public void timestampMicrosConversionShouldHandlePositiveAndNegativeFractionalInstants() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Instant positiveInstant = Instant.ofEpochSecond(1, 123_456_000);
    Instant negativeFractionalInstant = Instant.ofEpochSecond(-1, 500_000_000);

    assertEquals(Long.valueOf(1_123_456L), conversion.toLong(positiveInstant, null, null));
    assertEquals(positiveInstant, conversion.fromLong(1_123_456L, null, null));

    assertEquals(Long.valueOf(-500_000L), conversion.toLong(negativeFractionalInstant, null, null));
    assertEquals(negativeFractionalInstant, conversion.fromLong(-500_000L, null, null));
  }

  /*
   * BB6 - TimestampNanosConversion su timestamp positivo con nanosecondi.
   *
   * Category partition: - Categoria: precisione temporale. - Classe di
   * equivalenza selezionata: timestamp positivo con precisione nanosecondi.
   *
   * Input rappresentativo: - Instant.ofEpochSecond(1, 123456789) -> 1_123_456_789
   * nanosecondi
   */
  @Test
  public void timestampNanosConversionShouldHandlePositiveInstantWithNanoseconds() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Instant instant = Instant.ofEpochSecond(1, 123_456_789);

    assertEquals(Long.valueOf(1_123_456_789L), conversion.toLong(instant, null, null));
    assertEquals(instant, conversion.fromLong(1_123_456_789L, null, null));
  }

  /*
   * BB7 - bug exposing test handled with @ignore
   */

  @Ignore("Bug-exposing test: documents current failure in TimestampNanosConversion with negative fractional instants")
  @Test
  public void toLong_negativeInstantWithPositiveNanos_returnsNegativeNanos() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Instant instant = Instant.ofEpochSecond(-1, 500_000_000);

    assertEquals(Long.valueOf(-500_000_000L), conversion.toLong(instant, null, null));
  }

  /*
   * BB8 - getRecommendedSchema per le principali conversioni temporali.
   *
   * Category partition: - Categoria: schema Avro raccomandato. - Classi di
   * equivalenza: 1. conversioni basate su INT; 2. conversioni basate su LONG; 3.
   * logical type corretto.
   */
  @Test
  public void recommendedSchemasShouldHaveExpectedBaseTypesAndLogicalTypes() {
    Schema dateSchema = new TimeConversions.DateConversion().getRecommendedSchema();
    Schema timeMillisSchema = new TimeConversions.TimeMillisConversion().getRecommendedSchema();
    Schema timeMicrosSchema = new TimeConversions.TimeMicrosConversion().getRecommendedSchema();
    Schema timestampMillisSchema = new TimeConversions.TimestampMillisConversion().getRecommendedSchema();
    Schema timestampMicrosSchema = new TimeConversions.TimestampMicrosConversion().getRecommendedSchema();
    Schema timestampNanosSchema = new TimeConversions.TimestampNanosConversion().getRecommendedSchema();

    assertEquals(Schema.Type.INT, dateSchema.getType());
    assertNotNull(dateSchema.getLogicalType());
    assertEquals("date", dateSchema.getLogicalType().getName());

    assertEquals(Schema.Type.INT, timeMillisSchema.getType());
    assertNotNull(timeMillisSchema.getLogicalType());
    assertEquals("time-millis", timeMillisSchema.getLogicalType().getName());

    assertEquals(Schema.Type.LONG, timeMicrosSchema.getType());
    assertNotNull(timeMicrosSchema.getLogicalType());
    assertEquals("time-micros", timeMicrosSchema.getLogicalType().getName());

    assertEquals(Schema.Type.LONG, timestampMillisSchema.getType());
    assertNotNull(timestampMillisSchema.getLogicalType());
    assertEquals("timestamp-millis", timestampMillisSchema.getLogicalType().getName());

    assertEquals(Schema.Type.LONG, timestampMicrosSchema.getType());
    assertNotNull(timestampMicrosSchema.getLogicalType());
    assertEquals("timestamp-micros", timestampMicrosSchema.getLogicalType().getName());

    assertEquals(Schema.Type.LONG, timestampNanosSchema.getType());
    assertNotNull(timestampNanosSchema.getLogicalType());
    assertEquals("timestamp-nanos", timestampNanosSchema.getLogicalType().getName());
  }
}

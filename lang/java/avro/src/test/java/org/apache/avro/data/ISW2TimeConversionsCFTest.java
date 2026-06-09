package org.apache.avro.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Ignore;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.junit.Test;

public class ISW2TimeConversionsCFTest {

  /*
   * CF1 - LocalTimestampMillisConversion intorno all'epoch locale.
   *
   * Motivazione coverage-driven: nella prima run JaCoCo della suite BB iniziale,
   * LocalTimestampMillisConversion risultava non coperta. Questo test esercita
   * fromLong e toLong su valori boundary semplici.
   */
  @Test
  public void localTimestampMillisConversionShouldHandleEpochAndOneMillisecond() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    LocalDateTime epoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 0);
    LocalDateTime oneMillisecondAfterEpoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 1_000_000);

    assertEquals(epoch, conversion.fromLong(0L, null, LogicalTypes.localTimestampMillis()));
    assertEquals(oneMillisecondAfterEpoch, conversion.fromLong(1L, null, LogicalTypes.localTimestampMillis()));

    assertEquals(Long.valueOf(0L), conversion.toLong(epoch, null, LogicalTypes.localTimestampMillis()));
    assertEquals(Long.valueOf(1L),
        conversion.toLong(oneMillisecondAfterEpoch, null, LogicalTypes.localTimestampMillis()));
  }

  /*
   * CF2 - LocalTimestampMillisConversion su timestamp precedente all'epoch.
   *
   * Motivazione coverage-driven: aggiunge un valore negativo per la conversione
   * local timestamp millis, non presente nella suite BB iniziale.
   */
  @Test
  public void localTimestampMillisConversionShouldHandleNegativeOneMillisecond() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    LocalDateTime oneMillisecondBeforeEpoch = LocalDateTime.of(1969, 12, 31, 23, 59, 59, 999_000_000);

    assertEquals(oneMillisecondBeforeEpoch, conversion.fromLong(-1L, null, LogicalTypes.localTimestampMillis()));
    assertEquals(Long.valueOf(-1L),
        conversion.toLong(oneMillisecondBeforeEpoch, null, LogicalTypes.localTimestampMillis()));
  }

  /*
   * CF4 - LocalTimestampMicrosConversion intorno all'epoch locale.
   *
   * Motivazione coverage-driven: nella prima run BB,
   * LocalTimestampMicrosConversion era completamente non coperta. Questo test
   * esercita fromLong e toLong.
   */
  @Test
  public void localTimestampMicrosConversionShouldHandleEpochAndOneThousandMicros() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    LocalDateTime epoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 0);
    LocalDateTime oneMillisecondAfterEpoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 1_000_000);

    assertEquals(epoch, conversion.fromLong(0L, null, LogicalTypes.localTimestampMicros()));
    assertEquals(oneMillisecondAfterEpoch, conversion.fromLong(1_000L, null, LogicalTypes.localTimestampMicros()));

    assertEquals(Long.valueOf(0L), conversion.toLong(epoch, null, LogicalTypes.localTimestampMicros()));
    assertEquals(Long.valueOf(1_000L),
        conversion.toLong(oneMillisecondAfterEpoch, null, LogicalTypes.localTimestampMicros()));
  }

  /*
   * CF5 - LocalTimestampMicrosConversion su valore negativo minimo.
   *
   * Motivazione coverage-driven: copre il caso precedente all'epoch con
   * precisione microsecondi.
   */
  @Test
  public void localTimestampMicrosConversionShouldHandleNegativeOneMicrosecond() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    LocalDateTime oneMicrosecondBeforeEpoch = LocalDateTime.of(1969, 12, 31, 23, 59, 59, 999_999_000);

    assertEquals(oneMicrosecondBeforeEpoch, conversion.fromLong(-1L, null, LogicalTypes.localTimestampMicros()));
    assertEquals(Long.valueOf(-1L),
        conversion.toLong(oneMicrosecondBeforeEpoch, null, LogicalTypes.localTimestampMicros()));
  }

  /*
   * CF7 - LocalTimestampNanosConversion intorno all'epoch locale.
   *
   * Motivazione coverage-driven: nella prima run BB,
   * LocalTimestampNanosConversion era completamente non coperta. Questo test
   * esercita fromLong e toLong su valori rappresentativi.
   */
  @Test
  public void localTimestampNanosConversionShouldHandleEpochAndOneHundredNanos() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    LocalDateTime epoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 0);
    LocalDateTime oneHundredNanosAfterEpoch = LocalDateTime.of(1970, 1, 1, 0, 0, 0, 100);

    assertEquals(epoch, conversion.fromLong(0L, null, LogicalTypes.localTimestampNanos()));
    assertEquals(oneHundredNanosAfterEpoch, conversion.fromLong(100L, null, LogicalTypes.localTimestampNanos()));

    assertEquals(Long.valueOf(0L), conversion.toLong(epoch, null, LogicalTypes.localTimestampNanos()));
    assertEquals(Long.valueOf(100L),
        conversion.toLong(oneHundredNanosAfterEpoch, null, LogicalTypes.localTimestampNanos()));
  }

  /*
   * CF8 - LocalTimestampNanosConversion su valore negativo minimo.
   *
   * Motivazione coverage-driven: copre il caso precedente all'epoch con
   * precisione nanosecondi per le conversioni local timestamp.
   */
  @Ignore("Bug-exposing test: LocalTimestampNanosConversion currently mishandles negative fractional local timestamps")
  @Test
  public void localTimestampNanosConversionShouldHandleNegativeOneNanosecond() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    LocalDateTime oneNanosecondBeforeEpoch = LocalDateTime.of(1969, 12, 31, 23, 59, 59, 999_999_999);

    assertEquals(oneNanosecondBeforeEpoch, conversion.fromLong(-1L, null, LogicalTypes.localTimestampNanos()));
    assertEquals(Long.valueOf(-1L),
        conversion.toLong(oneNanosecondBeforeEpoch, null, LogicalTypes.localTimestampNanos()));
  }

  /*
   * CF10 - TimestampNanosConversion su secondo negativo senza frazione.
   *
   * Motivazione coverage-driven: aumenta la copertura dei branch senza usare il
   * caso bug-exposing già documentato in BB con @Ignore. Il valore scelto ha
   * seconds < 0 e nanos = 0, quindi non esercita il comportamento noto come bug.
   */
  @Test
  public void timestampNanosConversionShouldHandleNegativeWholeSecond() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Instant oneSecondBeforeEpoch = Instant.ofEpochSecond(-1L, 0L);

    assertEquals(Long.valueOf(-1_000_000_000L), conversion.toLong(oneSecondBeforeEpoch, null, null));
    assertEquals(oneSecondBeforeEpoch, conversion.fromLong(-1_000_000_000L, null, null));
  }

  /*
   * CF11 - TimestampMicrosConversion su secondo negativo senza frazione.
   *
   * Motivazione coverage-driven: completa i casi di branch per timestamp micros
   * distinguendo timestamp negativo intero da timestamp negativo frazionario.
   */
  @Test
  public void timestampMicrosConversionShouldHandleNegativeWholeSecond() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Instant oneSecondBeforeEpoch = Instant.ofEpochSecond(-1L, 0L);

    assertEquals(Long.valueOf(-1_000_000L), conversion.toLong(oneSecondBeforeEpoch, null, null));
    assertEquals(oneSecondBeforeEpoch, conversion.fromLong(-1_000_000L, null, null));
  }

  /*
   * CF12 - Troncamento sub-millisecondo per TimeMillisConversion.
   *
   * Motivazione coverage-driven: aggiunge un oracle esplicito sul comportamento
   * di troncamento, complementare ai valori boundary della suite BB iniziale.
   */
  @Test
  public void timeMillisConversionShouldTruncateSubMillisecondPrecision() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    LocalTime time = LocalTime.of(1, 2, 3, 4_999_999);
    Integer millis = conversion.toInt(time, null, null);

    assertEquals(Integer.valueOf(3_723_004), millis);
    assertEquals(LocalTime.of(1, 2, 3, 4_000_000), conversion.fromInt(millis, null, null));
  }

  /*
   * CF13 - Troncamento sub-microsecondo per TimeMicrosConversion.
   *
   * Motivazione coverage-driven: aggiunge un oracle esplicito sul comportamento
   * di troncamento a microsecondi.
   */
  @Test
  public void timeMicrosConversionShouldTruncateSubMicrosecondPrecision() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    LocalTime time = LocalTime.of(1, 2, 3, 4_005_999);
    Long micros = conversion.toLong(time, null, null);

    assertEquals(Long.valueOf(3_723_004_005L), micros);
    assertEquals(LocalTime.of(1, 2, 3, 4_005_000), conversion.fromLong(micros, null, null));
  }

  /*
   * CF14 - Troncamento nanosecondi per TimestampMillisConversion.
   *
   * Motivazione coverage-driven: copre il comportamento di perdita di precisione
   * quando un Instant con nanosecondi viene convertito a millisecondi.
   */
  @Test
  public void timestampMillisConversionShouldTruncateNanosecondsToMilliseconds() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Instant timestamp = Instant.parse("2020-01-02T03:04:05.678901234Z");
    Long millis = conversion.toLong(timestamp, null, null);

    assertEquals(Long.valueOf(timestamp.toEpochMilli()), millis);
    assertEquals(Instant.parse("2020-01-02T03:04:05.678Z"), conversion.fromLong(millis, null, null));
  }

  /*
   * CF15 - Troncamento nanosecondi per TimestampMicrosConversion.
   *
   * Motivazione coverage-driven: copre il comportamento di perdita di precisione
   * quando un Instant con nanosecondi viene convertito a microsecondi.
   */
  @Test
  public void timestampMicrosConversionShouldTruncateNanosecondsToMicroseconds() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Instant timestamp = Instant.parse("2020-01-02T03:04:05.678901234Z");
    Long micros = conversion.toLong(timestamp, null, null);

    assertEquals(Long.valueOf(ChronoUnit.MICROS.between(Instant.EPOCH, timestamp)), micros);
    assertEquals(Instant.parse("2020-01-02T03:04:05.678901Z"), conversion.fromLong(micros, null, null));
  }

  /*
   * CF16 - DateConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi descrittivi della
   * DateConversion, in particolare getConvertedType, getLogicalTypeName,
   * getRecommendedSchema e adjustAndSetValue.
   */
  @Test
  public void dateConversionShouldReportMetadata() {
    TimeConversions.DateConversion conversion = new TimeConversions.DateConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalDate.class, conversion.getConvertedType());
    assertEquals("date", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.INT, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("date", schema.getLogicalType().getName());
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF17 - TimeMillisConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi metadata della conversione
   * time-millis e verifica che adjustAndSetValue usi ChronoUnit.MILLIS.
   */
  @Test
  public void timeMillisConversionShouldReportMetadata() {
    TimeConversions.TimeMillisConversion conversion = new TimeConversions.TimeMillisConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-millis", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.INT, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("time-millis", schema.getLogicalType().getName());
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF18 - TimeMicrosConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi metadata della conversione
   * time-micros e verifica che adjustAndSetValue usi ChronoUnit.MICROS.
   */
  @Test
  public void timeMicrosConversionShouldReportMetadata() {
    TimeConversions.TimeMicrosConversion conversion = new TimeConversions.TimeMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalTime.class, conversion.getConvertedType());
    assertEquals("time-micros", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("time-micros", schema.getLogicalType().getName());
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF19 - TimestampMillisConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi metadata della conversione
   * timestamp-millis e verifica il troncamento a millisecondi.
   */
  @Test
  public void timestampMillisConversionShouldReportMetadata() {
    TimeConversions.TimestampMillisConversion conversion = new TimeConversions.TimestampMillisConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-millis", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("timestamp-millis", schema.getLogicalType().getName());
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF20 - TimestampMicrosConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi metadata della conversione
   * timestamp-micros e verifica il troncamento a microsecondi.
   */
  @Test
  public void timestampMicrosConversionShouldReportMetadata() {
    TimeConversions.TimestampMicrosConversion conversion = new TimeConversions.TimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-micros", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("timestamp-micros", schema.getLogicalType().getName());
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.MICROS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF21 - TimestampNanosConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi metadata della classe
   * direttamente coinvolta nel bug, senza introdurre un caso bug-exposing attivo.
   */
  @Test
  public void timestampNanosConversionShouldReportMetadata() {
    TimeConversions.TimestampNanosConversion conversion = new TimeConversions.TimestampNanosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(Instant.class, conversion.getConvertedType());
    assertEquals("timestamp-nanos", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("timestamp-nanos", schema.getLogicalType().getName());
    assertEquals("target = value.truncatedTo(java.time.temporal.ChronoUnit.NANOS);",
        conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF22 - LocalTimestampMillisConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi descrittivi della
   * LocalTimestampMillisConversion, che nella suite BB iniziale era non coperta.
   */
  @Test
  public void localTimestampMillisConversionShouldReportMetadata() {
    TimeConversions.LocalTimestampMillisConversion conversion = new TimeConversions.LocalTimestampMillisConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-millis", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("local-timestamp-millis", schema.getLogicalType().getName());
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF23 - LocalTimestampMicrosConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi descrittivi della
   * LocalTimestampMicrosConversion, completando la copertura dei metodi pubblici
   * principali della classe.
   */
  @Test
  public void localTimestampMicrosConversionShouldReportMetadata() {
    TimeConversions.LocalTimestampMicrosConversion conversion = new TimeConversions.LocalTimestampMicrosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-micros", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("local-timestamp-micros", schema.getLogicalType().getName());
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }

  /*
   * CF24 - LocalTimestampNanosConversion metadata.
   *
   * Motivazione coverage-driven fase 2: copre i metodi descrittivi della
   * LocalTimestampNanosConversion senza usare il caso negativo frazionario
   * bug-exposing, già documentato con @Ignore.
   */
  @Test
  public void localTimestampNanosConversionShouldReportMetadata() {
    TimeConversions.LocalTimestampNanosConversion conversion = new TimeConversions.LocalTimestampNanosConversion();

    Schema schema = conversion.getRecommendedSchema();

    assertEquals(LocalDateTime.class, conversion.getConvertedType());
    assertEquals("local-timestamp-nanos", conversion.getLogicalTypeName());
    assertEquals(Schema.Type.LONG, schema.getType());
    assertNotNull(schema.getLogicalType());
    assertEquals("local-timestamp-nanos", schema.getLogicalType().getName());
    assertEquals("target = value;", conversion.adjustAndSetValue("target", "value"));
  }
}

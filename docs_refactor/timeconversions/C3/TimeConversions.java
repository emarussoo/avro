/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.avro.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.apache.avro.Conversion;
import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;

public class TimeConversions {
  private static final long MICROS_PER_SECOND = 1_000_000L;
  private static final long NANOS_PER_SECOND = 1_000_000_000L;

  public TimeConversions() {
  }

  public static class DateConversion extends Conversion<LocalDate> {
    @Override
    public Class<LocalDate> getConvertedType() {
      return LocalDate.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "date";
    }

    @Override
    public LocalDate fromInt(Integer daysFromEpoch, Schema schema, LogicalType type) {
      return LocalDate.ofEpochDay(daysFromEpoch);
    }

    @Override
    public Integer toInt(LocalDate date, Schema schema, LogicalType type) {
      return Math.toIntExact(date.toEpochDay());
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.date().addToSchema(Schema.create(Schema.Type.INT));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ";";
    }
  }

  public static class TimeMillisConversion extends Conversion<LocalTime> {
    @Override
    public Class<LocalTime> getConvertedType() {
      return LocalTime.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "time-millis";
    }

    @Override
    public LocalTime fromInt(Integer millisFromMidnight, Schema schema, LogicalType type) {
      return LocalTime.ofNanoOfDay(TimeUnit.MILLISECONDS.toNanos(millisFromMidnight));
    }

    @Override
    public Integer toInt(LocalTime time, Schema schema, LogicalType type) {
      return Math.toIntExact(TimeUnit.NANOSECONDS.toMillis(time.toNanoOfDay()));
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.timeMillis().addToSchema(Schema.create(Schema.Type.INT));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MILLIS);";
    }
  }

  public static class TimeMicrosConversion extends Conversion<LocalTime> {
    @Override
    public Class<LocalTime> getConvertedType() {
      return LocalTime.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "time-micros";
    }

    @Override
    public LocalTime fromLong(Long microsFromMidnight, Schema schema, LogicalType type) {
      return LocalTime.ofNanoOfDay(TimeUnit.MICROSECONDS.toNanos(microsFromMidnight));
    }

    @Override
    public Long toLong(LocalTime time, Schema schema, LogicalType type) {
      return TimeUnit.NANOSECONDS.toMicros(time.toNanoOfDay());
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.timeMicros().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MICROS);";
    }
  }

  public static class TimestampMillisConversion extends Conversion<Instant> {
    @Override
    public Class<Instant> getConvertedType() {
      return Instant.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "timestamp-millis";
    }

    @Override
    public Instant fromLong(Long millisFromEpoch, Schema schema, LogicalType type) {
      return Instant.ofEpochMilli(millisFromEpoch);
    }

    @Override
    public Long toLong(Instant instant, Schema schema, LogicalType type) {
      return instant.toEpochMilli();
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.timestampMillis().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MILLIS);";
    }
  }

  public static class TimestampMicrosConversion extends Conversion<Instant> {
    @Override
    public Class<Instant> getConvertedType() {
      return Instant.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "timestamp-micros";
    }

    @Override
    public Instant fromLong(Long microsFromEpoch, Schema schema, LogicalType type) {
      long epochSeconds = microsFromEpoch / MICROS_PER_SECOND;
      long nanoAdjustment = (microsFromEpoch % MICROS_PER_SECOND) * 1_000L;
      return Instant.ofEpochSecond(epochSeconds, nanoAdjustment);
    }

    @Override
    public Long toLong(Instant instant, Schema schema, LogicalType type) {
      long secondsAsMicros = Math.multiplyExact(instant.getEpochSecond(), MICROS_PER_SECOND);
      return Math.addExact(secondsAsMicros, TimeUnit.NANOSECONDS.toMicros(instant.getNano()));
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.timestampMicros().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MICROS);";
    }
  }

  public static class TimestampNanosConversion extends Conversion<Instant> {
    @Override
    public Class<Instant> getConvertedType() {
      return Instant.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "timestamp-nanos";
    }

    @Override
    public Instant fromLong(Long nanosFromEpoch, Schema schema, LogicalType type) {
      long epochSeconds = nanosFromEpoch / NANOS_PER_SECOND;
      long nanoAdjustment = nanosFromEpoch % NANOS_PER_SECOND;
      return Instant.ofEpochSecond(epochSeconds, nanoAdjustment);
    }

    @Override
    public Long toLong(Instant instant, Schema schema, LogicalType type) {
      long secondsAsNanos = Math.multiplyExact(instant.getEpochSecond(), NANOS_PER_SECOND);
      return Math.addExact(secondsAsNanos, instant.getNano());
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.timestampNanos().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ";";
    }
  }

  public static class LocalTimestampMillisConversion extends Conversion<LocalDateTime> {
    private final TimestampMillisConversion timestampMillisConversion = new TimestampMillisConversion();

    @Override
    public Class<LocalDateTime> getConvertedType() {
      return LocalDateTime.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "local-timestamp-millis";
    }

    @Override
    public LocalDateTime fromLong(Long millisFromEpoch, Schema schema, LogicalType type) {
      return LocalDateTime.ofInstant(timestampMillisConversion.fromLong(millisFromEpoch, schema, type), ZoneOffset.UTC);
    }

    @Override
    public Long toLong(LocalDateTime timestamp, Schema schema, LogicalType type) {
      return timestampMillisConversion.toLong(timestamp.toInstant(ZoneOffset.UTC), schema, type);
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.localTimestampMillis().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MILLIS);";
    }
  }

  public static class LocalTimestampMicrosConversion extends Conversion<LocalDateTime> {
    private final TimestampMicrosConversion timestampMicrosConversion = new TimestampMicrosConversion();

    @Override
    public Class<LocalDateTime> getConvertedType() {
      return LocalDateTime.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "local-timestamp-micros";
    }

    @Override
    public LocalDateTime fromLong(Long microsFromEpoch, Schema schema, LogicalType type) {
      return LocalDateTime.ofInstant(timestampMicrosConversion.fromLong(microsFromEpoch, schema, type), ZoneOffset.UTC);
    }

    @Override
    public Long toLong(LocalDateTime timestamp, Schema schema, LogicalType type) {
      return timestampMicrosConversion.toLong(timestamp.toInstant(ZoneOffset.UTC), schema, type);
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.localTimestampMicros().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ".truncatedTo(" + ChronoUnit.class.getName() + ".MICROS);";
    }
  }

  public static class LocalTimestampNanosConversion extends Conversion<LocalDateTime> {
    private final TimestampNanosConversion timestampNanosConversion = new TimestampNanosConversion();

    @Override
    public Class<LocalDateTime> getConvertedType() {
      return LocalDateTime.class;
    }

    @Override
    public String getLogicalTypeName() {
      return "local-timestamp-nanos";
    }

    @Override
    public LocalDateTime fromLong(Long nanosFromEpoch, Schema schema, LogicalType type) {
      return LocalDateTime.ofInstant(timestampNanosConversion.fromLong(nanosFromEpoch, schema, type), ZoneOffset.UTC);
    }

    @Override
    public Long toLong(LocalDateTime timestamp, Schema schema, LogicalType type) {
      return timestampNanosConversion.toLong(timestamp.toInstant(ZoneOffset.UTC), schema, type);
    }

    @Override
    public Schema getRecommendedSchema() {
      return LogicalTypes.localTimestampNanos().addToSchema(Schema.create(Schema.Type.LONG));
    }

    @Override
    public String adjustAndSetValue(String varName, String valParamName) {
      return varName + " = " + valParamName + ";";
    }
  }
}

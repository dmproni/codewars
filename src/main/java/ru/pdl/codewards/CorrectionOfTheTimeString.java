package ru.pdl.codewards;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CorrectionOfTheTimeString {

  public static final int SECONDS_IN_DAY = 24 * 3600;

  public static String timeCorrect(String timestring) {
    if (timestring == null) return null;
    if (timestring.isBlank()) return "";
    if (!timestring.matches("(\\d{2}):(\\d{2}):(\\d{2})")) return null;
    final var timeParts = timestring.split(":");

    int secondsOfDay = Integer.parseInt(timeParts[0]) * 3600
      + Integer.parseInt(timeParts[1]) * 60 + Integer.parseInt(timeParts[2]);
    if (secondsOfDay >= SECONDS_IN_DAY) {
      secondsOfDay -= (secondsOfDay / SECONDS_IN_DAY) * SECONDS_IN_DAY;
    }
    return LocalTime.ofSecondOfDay(secondsOfDay).format(DateTimeFormatter.ISO_TIME);
  }

  public static int minValue(int[] values) {
    return Integer.parseInt(Arrays.stream(values)
      .distinct()
      .sorted()
      .mapToObj(v -> String.valueOf(v))
      .collect(Collectors.joining()));
  }
}

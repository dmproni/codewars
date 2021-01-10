package ru.pdl.codewards;

public class TimeFormatter {
  public static final int NUM_OF_SECONDS_IN_ONE_MINUTE = 60;
  public static final int NUM_OF_SECONDS_IN_ONE_HOUR = NUM_OF_SECONDS_IN_ONE_MINUTE * 60;
  public static final int NUM_OF_SECONDS_IN_ONE_DAY = NUM_OF_SECONDS_IN_ONE_HOUR * 24;
  public static final int NUM_OF_SECONDS_IN_A_YEAR = NUM_OF_SECONDS_IN_ONE_DAY * 365;
  public static final String NOW_LITERAL = "now";
  public static final int[] TIME_PROGRESSION_FACTORS = new int[]{
    NUM_OF_SECONDS_IN_A_YEAR, NUM_OF_SECONDS_IN_ONE_DAY, NUM_OF_SECONDS_IN_ONE_HOUR, NUM_OF_SECONDS_IN_ONE_MINUTE, 1};
  public static final String[] TIME_NAMES = new String[]{"year", "day", "hour", "minute", "second"};

  public static String formatDuration(int seconds) {
    if (seconds < 0) {
      throw new UnsupportedOperationException();
    } else if (seconds == 0) {
      return NOW_LITERAL;
    }

    final StringBuilder result = new StringBuilder();

    final int[] timeArray = fillTimeArray(seconds);
    for (int i = 0; i < timeArray.length; i++) {
      addTimeName(result, timeArray, i);
    }
    return result.toString();
  }

  private static int[] fillTimeArray(final int seconds) {
    final int[] timeArray = new int[5];

    int secondsRest = seconds;

    for (int i = 0; i < TIME_PROGRESSION_FACTORS.length; i++) {
      timeArray[i] = secondsRest / TIME_PROGRESSION_FACTORS[i];
      secondsRest %= TIME_PROGRESSION_FACTORS[i];
    }

    return timeArray;
  }

  private static void addTimeName(final StringBuilder result, final int[] timeArray, final int index) {
    final int count = timeArray[index];
    if (count > 0) {
      if (!result.toString().isEmpty()) {
        result.append(countPositiveAfterIndex(timeArray, index + 1) > 0 ? ", " : " and ");
      }

      result.append(count);
      result.append(' ');
      result.append(TIME_NAMES[index]);
      if (count > 1) {
        result.append('s');
      }
    }
  }

  private static int countPositiveAfterIndex(final int[] array, final int startIndex) {
    int result = 0;
    for (int i = startIndex; i < array.length; i++) {
      result += array[i] > 0 ? 1 : 0;
    }
    return result;
  }

}

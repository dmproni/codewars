package ru.pdl.codewards;

public class DatingAgeCalculator {
  private static final double UNDER_14_FACTOR = 0.1;
  private static final double COMMON_FACTOR = 2.0;
  private static final double COMMON_AVG_AGE = 7.0;
  private static final int THRESHOLD_AGE = 14;

  public static String datingRange(int age) {
    final int min = (int) (age <= THRESHOLD_AGE ? age - UNDER_14_FACTOR * age : age / COMMON_FACTOR + COMMON_AVG_AGE);
    final int max = (int) (age <= THRESHOLD_AGE ? age + UNDER_14_FACTOR * age : (age - COMMON_AVG_AGE) * COMMON_FACTOR);
    return String.format("%d-%d", min, max);
  }

  public static void main(String[] args) {
    System.out.println(datingRange(30));
    var s = "dkfj";
  }
}

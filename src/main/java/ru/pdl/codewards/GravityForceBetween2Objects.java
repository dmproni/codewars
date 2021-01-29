package ru.pdl.codewards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GravityForceBetween2Objects {
  private static final double GRAVITATIONAL_CONSTANT = 0.0000000000667;
  private static final double POUND_TO_KG_CONSTANT = 0.453592;
  private static final double FEET_TO_M_CONSTANT = 0.3048;

  public static double solution(double[] arrVal, String[] arrUnit) {
    final var m1 = massToKg(arrVal[0], arrUnit[0]);
    final var m2 = massToKg(arrVal[1], arrUnit[1]);
    final var distance = distanceToMeters(arrVal[2], arrUnit[2]);

    return (GRAVITATIONAL_CONSTANT * m1 * m2) / Math.pow(distance, 2);
  }

  private static double massToKg(final double m, final String unit) {
    return unit.equals("kg") ? m
      : unit.equals("g") ? m / 1000
      : unit.equals("mg") ? m / 1_000_000
      : unit.equals("μg") ? m / 1_000_000_000
      : unit.equals("lb") ? m * POUND_TO_KG_CONSTANT
      : 0.0;
  }

  private static double distanceToMeters(final double d, final String unit) {
    return unit.equals("m") ? d
      : unit.equals("cm") ? d / 100
      : unit.equals("mm") ? d / 1000
      : unit.equals("μm") ? d / 1_000_000
      : unit.equals("ft") ? d * FEET_TO_M_CONSTANT
      : 0.0;
  }

  public static void main(String[] args) {
    var list = Arrays.asList("one", "two", "three");
    var result =list.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
  }

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    final var catYears = (humanYears >= 1 ? 10 : 0) + (humanYears >= 2 ? 9 : 0) + (humanYears >= 3 ? (humanYears - 2) * 4 : 0);
    return new int[]{humanYears, catYears, 0};
  }
}

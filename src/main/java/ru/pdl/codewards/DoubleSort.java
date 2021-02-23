package ru.pdl.codewards;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleSort {

  public static Object[] dbSort(Object[] a) {
    return Arrays.stream(a).sorted((v1, v2) -> {
      final var firstIsInt = v1 instanceof Integer;
      final var secondIsInt = v2 instanceof Integer;
      if (firstIsInt && secondIsInt) return ((Integer) v1).compareTo((Integer) v2);
      if (!firstIsInt && !secondIsInt) return ((String) v1).compareTo((String) v2);
      if (firstIsInt && !secondIsInt) return -1;
      return 1;
    })
      .toArray();
  }

  private static boolean isStr(final Object obj) {
    return obj instanceof String;
  }

  private static boolean isInt(final Object obj) {
    return obj instanceof Integer;
  }

  public static void main(String[] args) {
    System.out.println(61 / 60);
    System.out.println(String.format("%H2", 5));

    System.out.println(LocalTime.of(5, 25, 59));
    System.out.println(LocalTime.ofSecondOfDay(5 * 60 * 60 + 25 * 60 + 59).format(DateTimeFormatter.ISO_TIME));
  }

}

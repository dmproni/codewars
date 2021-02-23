package ru.pdl.codewards;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewTest {

  public static String solve(String s, int a, int b) {
    final var alignedFinish = Math.min(b + 1, s.length());
    return s.substring(0, a)
      + new StringBuilder(s.substring(a, alignedFinish)).reverse().toString()
      + s.substring(alignedFinish);
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeated("teeter"));
    final var a = new int[]{1, 5, 61, 9309};
    final var r = Math.sqrt(Arrays.stream(a).map(v -> v * v).sum()) / 2;
    final var sr = new String[]{"one", "two"};

  }

  public static Character firstNonRepeated(String source) {
    final var repeatedCharacters = source.codePoints()
      .mapToObj(v -> (char) v)
      .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
      .entrySet().stream()
      .filter(v -> v.getValue() > 1)
      .map(v -> v.getKey())
      .collect(Collectors.toSet());

    for (int i = 0; i < source.length(); i++) {
      final var current = source.charAt(i);
      if (source.indexOf(current, i + 1) == -1) {
        return current;
      }
    }
    return null;
  }

  public static String solve(final String str) {
    final var counts = str.codePoints().mapToObj(v -> (char) v)
      .collect(Collectors.groupingBy(v -> Character.isUpperCase(v), Collectors.counting()));

    return counts.getOrDefault(true, 0L) > counts.getOrDefault(false, 0L) ? str.toLowerCase() : str.toUpperCase();
  }

}

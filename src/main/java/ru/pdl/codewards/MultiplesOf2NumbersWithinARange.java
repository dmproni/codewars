package ru.pdl.codewards;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplesOf2NumbersWithinARange {
  public static List<Integer> findMultiples(int s1, int s2, int s3) {
    final var least = Math.min(s1, s2);
    return IntStream.iterate(least, v -> v < s3, v -> v + least)
      .filter(v -> v % s1 == 0 && v % s2 == 0)
      .boxed()
      .collect(Collectors.toList());
  }
}

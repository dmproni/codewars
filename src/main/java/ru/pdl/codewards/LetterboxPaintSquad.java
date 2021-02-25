package ru.pdl.codewards;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterboxPaintSquad {
  public static int[] paintLetterboxes(final int start, final int end) {
    final var result = new int[10];
    final var map = IntStream.rangeClosed(start, end)
      .flatMap(LetterboxPaintSquad::toIntDigits)
      .boxed()
      .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

    for (int i = 0; i < 10; i++) {
      result[i] = map.getOrDefault(i, 0L).intValue();
    }

    return result;
  }

  private static IntStream toIntDigits(final int i) {
    return IntStream.iterate(i, v -> v != 0, v -> v / 10).map(v -> v % 10);
  }
}

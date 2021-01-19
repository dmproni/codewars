package ru.pdl.codewards;

import java.util.Arrays;

public class SquareNSum {
  public static int squareSum(final int[] n) {
    return Arrays.stream(n).map(v -> v * v).sum();
  }
}

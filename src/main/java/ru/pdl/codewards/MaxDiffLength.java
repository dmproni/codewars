package ru.pdl.codewards;

public class MaxDiffLength {

  public static int mxdiflg(String[] a1, String[] a2) {
    if (a1 == null || a1.length == 0 || a2 == null || a2.length == 0) return -1;
    final var first = findMinAndMax(a1);
    final var second = findMinAndMax(a2);
    return Math.max(first.max - second.min, second.max - first.min);
  }

  private static MinAndMax findMinAndMax(final String[] arr) {
    final var result = new MinAndMax();
    for (String s : arr) {
      var size = s.length();
      if (size > result.max) result.max = size;
      if (size < result.min) result.min = size;
    }
    return result;
  }

  public static class MinAndMax {
    public int max = Integer.MIN_VALUE;
    public int min = Integer.MAX_VALUE;
  }

}

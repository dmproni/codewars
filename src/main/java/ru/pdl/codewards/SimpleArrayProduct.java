package ru.pdl.codewards;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleArrayProduct {

  public static int solve(int[][] arr) {
    final var arrOfMinAndMax = Arrays.stream(arr).map(v -> minAndMax(v)).toArray(int[][]::new);
    return permute(arr.length).stream()
      .mapToInt(v -> calcProduct(arrOfMinAndMax, v))
      .max().orElseThrow();
  }

  private static int calcProduct(final int[][] arrOfMinAndMax, final int[] permutationsArr) {
    return IntStream.range(0, arrOfMinAndMax.length)
      .map(i -> arrOfMinAndMax[i][permutationsArr[i]])
      .reduce((v1, v2) -> v1 * v2)
      .orElseThrow();
  }

  private static List<int[]> permute(final int length) {
    return IntStream.range(0, (int) Math.pow(2, length))
      .mapToObj(v -> toBinaryFixedSize(v, length))
      .collect(Collectors.toList());
  }

  private static int[] toBinaryFixedSize(final int i, final int length) {
    final var binary = Integer.toBinaryString(i);
    return ("0".repeat(length - binary.length()) + binary).codePoints().map(v -> v - 48).toArray();
  }

  private static int[] minAndMax(final int[] arr) {
    final var result = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
    for (int i : arr) {
      if (i > result[1]) result[1] = i;
      if (i < result[0]) result[0] = i;
    }
    return result;
  }
}

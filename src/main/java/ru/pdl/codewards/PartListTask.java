package ru.pdl.codewards;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartListTask {

  public static String[][] partlist(String[] arr) {
    return IntStream.range(0, arr.length - 1)
      .mapToObj(i -> new String[]{formString(arr, 0, i), formString(arr, i + 1, arr.length - 1)})
      .toArray(String[][]::new);
  }

  private static String formString(final String[] arr, final int from, final int to) {
    return IntStream.rangeClosed(from, to).mapToObj(i -> arr[i]).collect(Collectors.joining(" "));
  }

}

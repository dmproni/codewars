package ru.pdl.codewards;

import java.util.stream.IntStream;

public class ReversedSequence {

  public static int[] reverse(int n) {
    return IntStream.iterate(n, v -> v - 1).limit(n).toArray();
  }

}

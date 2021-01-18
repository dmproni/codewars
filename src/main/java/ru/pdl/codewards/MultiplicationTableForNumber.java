package ru.pdl.codewards;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableForNumber {

  public static String multiTable(int num) {
    return IntStream.rangeClosed(1, 10)
      .mapToObj(v -> String.format("%d * %d = %d", v, num, v * num))
      .collect(Collectors.joining("\n"));
  }

}

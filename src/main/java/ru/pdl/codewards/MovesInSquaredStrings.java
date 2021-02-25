package ru.pdl.codewards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovesInSquaredStrings {

  public static String vertMirror(String strng) {
    return Arrays.stream(strng.split("\n"))
      .map(v -> new StringBuilder(v).reverse().toString())
      .collect(Collectors.joining("\n"));
  }

  public static String horMirror(String strng) {
    final var split = strng.split("\n");
    return IntStream.range(0, split.length)
      .boxed()
      .sorted(Comparator.reverseOrder())
      .map(v -> split[v])
      .collect(Collectors.joining("\n"));
  }

  public static String oper(UnaryOperator<String> operator, String s) {
    return operator.apply(s);
  }

}

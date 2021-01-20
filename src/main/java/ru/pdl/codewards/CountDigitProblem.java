package ru.pdl.codewards;

import java.util.stream.IntStream;

public class CountDigitProblem {
  public static int nbDig(int n, int d) {
    final var searchedCharacter = (int) Character.forDigit(d, 10);
    return (int) IntStream.rangeClosed(0, n)
      .mapToLong(v -> (long) v * v)
      .mapToObj(v -> String.valueOf(v))
      .mapToLong(v -> v.chars().filter(r -> r == searchedCharacter).count())
      .sum();
  }

  public static void main(String[] args) {
    System.out.println('1' == Character.forDigit(1, 10));
  }
}

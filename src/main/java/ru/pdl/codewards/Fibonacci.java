package ru.pdl.codewards;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
  private static final List<BigInteger> FIBONACCI_NUMBERS = new ArrayList<>(
    Stream.of(0, 1, 1, 2, 3, 5, 8).map(BigInteger::valueOf).collect(Collectors.toList())
  );

  public static BigInteger calculate(final int ordinal) {
    while (FIBONACCI_NUMBERS.size() < ordinal) {
      final BigInteger last = FIBONACCI_NUMBERS.get(FIBONACCI_NUMBERS.size() - 1);
      final BigInteger previous = FIBONACCI_NUMBERS.get(FIBONACCI_NUMBERS.size() - 2);
      FIBONACCI_NUMBERS.add(last.add(previous));
    }
    return FIBONACCI_NUMBERS.get(ordinal - 1);
  }

  public static void main(String[] args) {
    System.out.println(calculate(5));
    System.out.println(calculate(7));
    System.out.println(calculate(15));
    System.out.println(calculate(100));
    System.out.println(calculate(1000));
    System.out.println(calculate(10000));
  }
}

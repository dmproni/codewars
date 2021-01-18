package ru.pdl.codewards;

import java.util.Arrays;

public class SumArray {

  public static double sum(double[] numbers) {
    return numbers == null || numbers.length == 0 ? 0.0 : Arrays.stream(numbers).sum();
  }

}

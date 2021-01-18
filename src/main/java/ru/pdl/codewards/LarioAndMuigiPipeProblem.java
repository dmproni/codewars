package ru.pdl.codewards;

public class LarioAndMuigiPipeProblem {

  public static int[] pipeFix(int[] numbers) {
    final var first = numbers[0];
    final int[] result = new int[numbers[numbers.length - 1] - first + 1];

    for (int i = 0; i < result.length; i++) {
      result[i] = first + i;
    }

    return result;
  }

}

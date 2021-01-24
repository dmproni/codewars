package ru.pdl.codewards;

public class AdditiveInverseOfNumbers {

  public static int[] invert(int[] array) {
    final int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = -array[i];
    }
    return result;
  }

}

package ru.pdl.codewards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdditiveInverseOfNumbers {

  public static int[] invert(int[] array) {
    final int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = -array[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Object[] a = new Object[5];
  }

}

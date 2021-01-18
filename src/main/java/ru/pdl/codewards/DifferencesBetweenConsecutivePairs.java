package ru.pdl.codewards;

import java.util.Arrays;

public class DifferencesBetweenConsecutivePairs {

  public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    int temp = 0;
    for (int i = arr.length - 1; i > 0; i--) {
      temp += arr[i] - arr[i - 1];
    }
    return temp;
  }

}

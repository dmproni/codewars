package ru.pdl;

import java.util.Arrays;

public class InsertionSortDecreasingAndIncreasing {
  public static void main(String[] args) {
//    final var arr = new int[]{31, 41, 59, 26, 41, 58};
    final var arr = new int[]{1, 2, 10, 20, 15, 16, 5, 8, 100, 200, 999, 560};
    sortIncreasing(arr);
//    sortDecreasing(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sortIncreasing(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      final int key = arr[i];
      int index = i - 1;
      while (index >= 0 && key < arr[index]) {
        arr[index + 1] = arr[index];
        index--;
      }
      arr[index + 1] = key;
    }
  }

  public static void sortDecreasing(int[] arr) {
    for (int i = arr.length - 2; i >= 0; i--) {
      final int key = arr[i];
      int index = i + 1;
      while (index < arr.length && key < arr[index]) {
        arr[index - 1] = arr[index];
        index++;
      }
      arr[index - 1] = key;
    }
  }
}

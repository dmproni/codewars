package ru.pdl.kotiyana;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    final int arr[] = {3, 60, 35, 2, 45, 320, 5};
    System.out.println("Array before: " + Arrays.toString(arr));
    bubbleSort(arr);
    System.out.println("Array after: " + Arrays.toString(arr));
    System.out.println(1 << 13);
  }

  static void bubbleSort(final int[] arr) {
    final int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          //swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

}

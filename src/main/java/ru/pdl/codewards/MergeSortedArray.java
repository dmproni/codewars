package ru.pdl.codewards;

import java.util.Arrays;

public class MergeSortedArray {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    System.out.println(Arrays.toString(nums1));
    System.out.println("m = " + m);
    System.out.println(Arrays.toString(nums2));
    System.out.println("n = " + n);

    int i2 = n - 1;
    int i1 = m - 1;
    int i = nums1.length - 1;

    while (i >= 0 && i2 >= 0) {
      if (i1 < 0 || nums2[i2] >= nums1[i1]) {
        nums1[i] = nums2[i2];
        i--;
        i2--;
      } else {
        nums1[i] = nums1[i1];
        i--;
        i1--;
      }
    }
  }
}

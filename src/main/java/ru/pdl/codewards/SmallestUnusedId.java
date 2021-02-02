package ru.pdl.codewards;

import java.util.Arrays;

public class SmallestUnusedId {
  public static int nextId(int[] ids) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < ids.length; i++) {
      if (ids[i] < smallest) {
        smallest = ids[i];
      }
    }

    if (smallest > 0) {
      return 0;
    }
    return 0;
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    var r = new int[]{a, b, c};
  }

}

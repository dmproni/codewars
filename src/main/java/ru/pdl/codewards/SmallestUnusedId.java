package ru.pdl.codewards;

import java.util.Arrays;

public class SmallestUnusedId {
  public static int nextId(int[] ids) {
    Arrays.sort(ids);

    if (ids.length == 0 || ids[0] != 0) {
      return 0;
    }

    int index = 0;
    while (index + 1 < ids.length) {
      if (ids[index + 1] - ids[index] > 1) {
        return ids[index] + 1;
      }
      index++;
    }

    return ids[ids.length - 1] + 1;
  }

}

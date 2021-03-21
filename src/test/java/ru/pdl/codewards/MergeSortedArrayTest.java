package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {
  @Test
  public void test() {
    final var a1 = new int[]{1, 2, 3, 0, 0, 0};
    final var a2 = new int[]{2, 5, 6};
    MergeSortedArray.merge(a1, 3, a2, a2.length);
    Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, a1);
  }
}
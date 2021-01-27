package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergingTwoIntArraysTest {
  @Test
  public void basicTest() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, MergingTwoIntArrays.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    assertArrayEquals(new int[]{2, 4, 6, 8}, MergingTwoIntArrays.mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6}));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferencesBetweenConsecutivePairsTest {

  private static int sumOfDifferences(int[] arr) {
    return DifferencesBetweenConsecutivePairs.sumOfDifferences(arr);
  }

  @Test
  public void basicTests() {
    assertEquals(9, sumOfDifferences(new int[]{1, 2, 10}));
    assertEquals(2, sumOfDifferences(new int[]{-3, -2, -1}));
    assertEquals(0, sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
    assertEquals(34, sumOfDifferences(new int[]{-17, 17}));
    assertEquals(0, sumOfDifferences(new int[0]));
    assertEquals(0, sumOfDifferences(new int[]{0}));
    assertEquals(0, sumOfDifferences(new int[]{-1}));
    assertEquals(0, sumOfDifferences(new int[]{1}));
  }
}
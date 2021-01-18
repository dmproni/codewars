package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestUnusedIdTest {

  private static int nextId(final int[] usedIds) {
    return SmallestUnusedId.nextId(usedIds);
  }

  @Test
  public void fixedTests() {
    assertEquals(0, nextId(new int[]{}));
    assertEquals(4, nextId(new int[]{0, 1, 2, 3, 5}));
    assertEquals(4, nextId(new int[]{1, 2, 0, 2, 3}));
    assertEquals(4, nextId(new int[]{1, 2, 0, 2, 3, 5}));
    assertEquals(11, nextId(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }

}
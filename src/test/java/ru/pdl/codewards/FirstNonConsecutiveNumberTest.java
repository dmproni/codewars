package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonConsecutiveNumberTest {
  @Test
  public void basicTests() {
    assertEquals(Integer.valueOf(6), FirstNonConsecutiveNumber.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    assertEquals(null, FirstNonConsecutiveNumber.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    assertEquals(Integer.valueOf(6), FirstNonConsecutiveNumber.find(new int[]{4, 6, 7, 8, 9, 11}));
    assertEquals(Integer.valueOf(11), FirstNonConsecutiveNumber.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
    assertEquals(null, FirstNonConsecutiveNumber.find(new int[]{31, 32}));
    assertEquals(Integer.valueOf(0), FirstNonConsecutiveNumber.find(new int[]{-3, -2, 0, 1}));
    assertEquals(Integer.valueOf(-1), FirstNonConsecutiveNumber.find(new int[]{-5, -4, -3, -1}));
  }
}
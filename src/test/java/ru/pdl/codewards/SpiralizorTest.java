package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SpiralizorTest {

  @Test
  void test5() {
    assertArrayEquals(
      new int[][]{
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}
      },
      Spiralizor.spiralize(5));
  }

  @Test
  void test8() {
    assertArrayEquals(
      new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 0, 0, 1, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1},
      },
      Spiralizor.spiralize(8));
  }

}
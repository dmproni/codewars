package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnailSortTest {

  @Test
  void given4x4_ShouldSucceed() {
    var arr = new int[4][4];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[0][3] = 4;
    arr[1][0] = 5;
    arr[1][1] = 6;
    arr[1][2] = 7;
    arr[1][3] = 8;
    arr[2][0] = 9;
    arr[2][1] = 10;
    arr[2][2] = 11;
    arr[2][3] = 12;
    arr[3][0] = 13;
    arr[3][1] = 14;
    arr[3][2] = 15;
    arr[3][3] = 16;
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, SnailSort.snail(arr));
  }

  @Test
  void given3x3_ShouldSucceed() {
    var arr = new int[3][3];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;
    arr[2][0] = 7;
    arr[2][1] = 8;
    arr[2][2] = 9;
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, SnailSort.snail(arr));
  }

  @Test
  void given2x2_ShouldSucceed() {
    var arr = new int[2][2];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[1][0] = 3;
    arr[1][1] = 4;
    Assertions.assertArrayEquals(new int[]{1, 2, 4, 3}, SnailSort.snail(arr));
  }

  @Test
  void given1x1_ShouldReturnOneSameElement() {
    var arr = new int[1][1];
    arr[0][0] = 1;
    Assertions.assertArrayEquals(new int[]{1}, SnailSort.snail(arr));
  }

  @Test
  void givenEmpty_ShouldReturnEmpty() {
    Assertions.assertArrayEquals(new int[0], SnailSort.snail(new int[1][0]));
  }

  @Test
  void givenNull_ShouldReturnNull() {
    Assertions.assertArrayEquals(null, SnailSort.snail(null));
  }

}
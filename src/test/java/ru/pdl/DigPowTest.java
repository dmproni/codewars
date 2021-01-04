package ru.pdl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.pdl.DigPow.digPow;

class DigPowTest {

  @Test
  void Test1() {
    assertEquals(1, digPow(89, 1));
  }

  @Test
  void Test2() {
    assertEquals(-1, digPow(92, 1));
  }

  @Test
  void Test3() {
    assertEquals(51, digPow(46288, 3));
  }

}
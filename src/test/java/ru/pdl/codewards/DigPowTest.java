package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigPowTest {

  @Test
  void Test1() {
    Assertions.assertEquals(1, DigPow.digPow(89, 1));
  }

  @Test
  void Test2() {
    Assertions.assertEquals(-1, DigPow.digPow(92, 1));
  }

  @Test
  void Test3() {
    Assertions.assertEquals(51, DigPow.digPow(46288, 3));
  }

}
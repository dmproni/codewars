package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WilsonPrimesTest {
  @Test
  public void test1() {
    assertEquals(false, WilsonPrimes.am_i_wilson(0));
  }

  @Test
  public void test2() {
    assertEquals(false, WilsonPrimes.am_i_wilson(1));
  }

  @Test
  public void test3() {
    assertEquals(true, WilsonPrimes.am_i_wilson(5));
  }

  @Test
  public void test4() {
    assertEquals(false, WilsonPrimes.am_i_wilson(327));
  }

  @Test
  public void test5() {
    assertEquals(false, WilsonPrimes.am_i_wilson(593));
  }
}
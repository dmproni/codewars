package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipCalculatorTest {
  @Test
  public void test1() {
    assertEquals(new Integer(2), TipCalculator.calculateTip(30d, "poor"));
  }

  @Test
  public void test2() {
    assertEquals(new Integer(4), TipCalculator.calculateTip(20d, "Excellent"));
  }

  @Test
  public void test3() {
    assertNull(TipCalculator.calculateTip(20d, "hi"));
  }

  @Test
  public void test4() {
    assertEquals(new Integer(17), TipCalculator.calculateTip(107.65, "GReat"));
  }
}
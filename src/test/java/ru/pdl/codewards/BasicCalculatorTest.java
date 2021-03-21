package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BasicCalculatorTest {
  @Test
  public void BasicTest() {
    assertEquals(Double.valueOf(11.2), BasicCalculator.calculate(3.2, "+", 8));
    assertEquals(Double.valueOf(-4.8), BasicCalculator.calculate(3.2, "-", 8));
    assertEquals(Double.valueOf(0.4), BasicCalculator.calculate(3.2, "/", 8));
    assertEquals(Double.valueOf(25.6), BasicCalculator.calculate(3.2, "*", 8));
    assertEquals(Double.valueOf(-3), BasicCalculator.calculate(-3, "+", 0));
    assertEquals(Double.valueOf(-3), BasicCalculator.calculate(-3, "-", 0));
    assertNull(BasicCalculator.calculate(-3, "/", 0));
    assertEquals(Double.valueOf(1), BasicCalculator.calculate(-2, "/", -2));
    assertEquals(Double.valueOf(0), BasicCalculator.calculate(-3, "*", 0));
    assertNull(BasicCalculator.calculate(-3, "w", 0));
  }
}
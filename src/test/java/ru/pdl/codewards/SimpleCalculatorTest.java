package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {
  @Test
  public void simpleLiteral() {
    assertEquals(127.0, SimpleCalculator.evaluate("127"), 1e-4, "simple literal");
  }

  @Test
  public void subtractionAndAddition() {
    assertEquals(5.0, SimpleCalculator.evaluate("2 + 3"), 1e-4, "addition");
    assertEquals(-5.0, SimpleCalculator.evaluate("2 - 3 - 4"), 1e-4, "subtraction");
  }

  @Test
  public void divisionAndMultiplication() {
    assertEquals(10.0, SimpleCalculator.evaluate("10 * 5 / 5"), 1e-4, "mixed division and multiplication");
  }

  @Test
  public void allMixed() {
    assertEquals(13.0, SimpleCalculator.evaluate("2 / 2 + 3 * 4"), 1e-4, "mixed");
  }

  @Test
  public void floats() {
    assertEquals(0.0, SimpleCalculator.evaluate("7.7 - 3.3 - 4.4"), 1e-4, "floats 1");
  }

  @Test
  public void otherFloats() {
    assertEquals(6.6, SimpleCalculator.evaluate("1.1 + 2.2 + 3.3"), 1e-4, "floats 666");
  }

  @Test
  public void literal() {
    assertEquals(-1.097745301E9, SimpleCalculator.evaluate("-1.097745301E9"), 1e-4, "floats 132");
  }
}
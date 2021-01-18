package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FixTheFunctionTest {
  @Test
  public void testAddFive() {
    assertEquals(10, FixTheFunction.addFive(5));
  }

  @Test
  public void testAddZero() {
    assertEquals(5, FixTheFunction.addFive(0));
  }

  @Test
  public void testAddNegativeFive() {
    assertEquals(0, FixTheFunction.addFive(-5));
  }

  @Test
  public void testRandom() {
    for (int i = 0; i < 50; i++) {
      int rand = (int) (Math.random() * 1000) + 1;
      assertEquals(rand + 5, FixTheFunction.addFive(rand));
    }
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatingAgeCalculatorTest {
  @Test
  public void exampleTests() {
    assertEquals("15-20", DatingAgeCalculator.datingRange(17));
    assertEquals("27-66", DatingAgeCalculator.datingRange(40));
    assertEquals("14-16", DatingAgeCalculator.datingRange(15));
    assertEquals("24-56", DatingAgeCalculator.datingRange(35));
    assertEquals("9-11", DatingAgeCalculator.datingRange(10));
  }
}
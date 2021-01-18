package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuarterOfTheYearTest {

  @Test
  public void exampleTests() {
    assertEquals(1, QuarterOfTheYear.quarterOf(3));
    assertEquals(3, QuarterOfTheYear.quarterOf(8));
    assertEquals(4, QuarterOfTheYear.quarterOf(11));
  }

}
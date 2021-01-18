package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolAverageMarksTest {
  @Test
  public void simpleTest() {
    assertEquals(2, SchoolAverageMarks.getAverage(new int[]{2, 2, 2, 2}));
    assertEquals(3, SchoolAverageMarks.getAverage(new int[]{1, 2, 3, 4, 5}));
    assertEquals(1, SchoolAverageMarks.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
  }
}
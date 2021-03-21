package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleOfNumbersTaskTest {
  @Test
  void basicTests() {
    assertEquals(7, CircleOfNumbersTask.circleOfNumbers(10, 2));
    assertEquals(2, CircleOfNumbersTask.circleOfNumbers(10, 7));
    assertEquals(3, CircleOfNumbersTask.circleOfNumbers(4, 1));
    assertEquals(0, CircleOfNumbersTask.circleOfNumbers(6, 3));
    assertEquals(10, CircleOfNumbersTask.circleOfNumbers(20, 0));
  }
}
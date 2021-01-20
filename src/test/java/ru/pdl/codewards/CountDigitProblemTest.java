package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDigitProblemTest {
  private static void testing(int actual, int expected) {
    assertEquals(expected, actual);
  }

  @Test
  public void test() {
    System.out.println("Fixed Tests nbDig");
    testing(CountDigitProblem.nbDig(10, 1), 4);
    testing(CountDigitProblem.nbDig(5750, 0), 4700);
    testing(CountDigitProblem.nbDig(11011, 2), 9481);
    testing(CountDigitProblem.nbDig(12224, 8), 7733);
    testing(CountDigitProblem.nbDig(11549, 1), 11905);
  }
}
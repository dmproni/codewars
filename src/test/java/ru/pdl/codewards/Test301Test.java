package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test301Test {
  @Test
  public void exampleTests1() {
    // n?
    assertEquals(0, Test301.testTrueFalse(0));
    assertEquals(1, Test301.testTrueFalse(1));
  }

  @Test
  public void exampleTests2() {
    // n - 1?
    assertEquals(1, Test301.testTrueFalse(2));
    assertEquals(2, Test301.testTrueFalse(3));
  }

  @Test
  public void exampleTests3() {
    // round(n / 3f)?
    assertEquals(1, Test301.testTrueFalse(4));
    assertEquals(2, Test301.testTrueFalse(5));
    assertEquals(2, Test301.testTrueFalse(6));
  }

  @Test
  public void exampleTests4() {
    // none of the above?
    assertEquals(3, Test301.testTrueFalse(7));
    assertEquals(1, Test301.testTrueFalse(8));
    assertEquals(2, Test301.testTrueFalse(9));
    assertEquals(2, Test301.testTrueFalse(10));
    assertEquals(3, Test301.testTrueFalse(100));
    assertEquals(6, Test301.testTrueFalse(1000));
    assertEquals(5, Test301.testTrueFalse(10000));
  }
}
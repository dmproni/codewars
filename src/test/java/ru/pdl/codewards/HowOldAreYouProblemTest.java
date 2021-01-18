package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowOldAreYouProblemTest {
  private static int howOld(final String answer) {
    return HowOldAreYouProblem.howOld(answer);
  }

  @Test
  public void test1() {
    assertEquals(5, howOld("5 years old"));
  }

  @Test
  public void test2() {
    assertEquals(9, howOld("9 years old"));
  }

  @Test
  public void test3() {
    assertEquals(1, howOld("1 year old"));
  }
}
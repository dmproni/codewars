package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockMillisecondsAfterMidnightTest {
  @Test
  public void test1() {
    assertEquals(61000, ClockMillisecondsAfterMidnight.Past(0, 1, 1));
    assertEquals(69465000, ClockMillisecondsAfterMidnight.Past(19, 17, 45));
  }
}
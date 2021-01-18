package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BobAndEnoughSpaceOnBusProblemTest {
  @Test
  public void testBob() {
    assertEquals(0, BobAndEnoughSpaceOnBusProblem.enough(10, 5, 5));
    assertEquals(10, BobAndEnoughSpaceOnBusProblem.enough(100, 60, 50));
    assertEquals(0, BobAndEnoughSpaceOnBusProblem.enough(20, 5, 5));
  }
}
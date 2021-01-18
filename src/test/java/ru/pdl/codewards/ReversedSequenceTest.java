package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReversedSequenceTest {
  @Test
  public void simpleTest() {
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ReversedSequence.reverse(5));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversedStringsTest {
  @Test
  public void sampleTests() {
    assertEquals("dlrow", ReversedStrings.solution("world"));
  }
}
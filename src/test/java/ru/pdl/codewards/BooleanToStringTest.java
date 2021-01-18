package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanToStringTest {
  @Test
  public void testTrue() {
    assertEquals("true", BooleanToString.convert(true));
  }

  @Test
  public void testFalse() {
    assertEquals("false", BooleanToString.convert(false));
  }
}
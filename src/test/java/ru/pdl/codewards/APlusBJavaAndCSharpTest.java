package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APlusBJavaAndCSharpTest {
  @Test
  public void testSum() throws Exception {
    byte a = 1;
    byte b = 2;
    assertEquals(3, APlusBJavaAndCSharp.sum(a, b));
  }
}
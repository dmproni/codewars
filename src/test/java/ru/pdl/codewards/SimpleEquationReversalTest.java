package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleEquationReversalTest {
  @Test
  public void basicTests() {
    assertEquals("y/b*100", SimpleEquationReversal.solve("100*b/y"));
    assertEquals("30*d/c-b+a", SimpleEquationReversal.solve("a+b-c/d*30"));
    assertEquals("50+c/b*a", SimpleEquationReversal.solve("a*b/c+50"));
  }
}
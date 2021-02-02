package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleStringReversalTest {
  @Test
  public void basicTests() {
    assertEquals("srawedoc", SimpleStringReversal.solve("codewars"));
    assertEquals("edoc ruoy", SimpleStringReversal.solve("your code"));
    assertEquals("skco redo cruoy", SimpleStringReversal.solve("your code rocks"));
  }

  @Test
  public void otherTests() {
    assertEquals("gace chmw ii hcgiff aehtlspasxpailhfukmpkfiw yzwm cfgcp",
      SimpleStringReversal.solve("pcgf cmwz yw ifkpmk ufhliapxsapsltheaffigchi iwmh cecag"));
  }
}
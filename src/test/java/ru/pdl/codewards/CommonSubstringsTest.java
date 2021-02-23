package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommonSubstringsTest {
  @Test
  public void ShouldBeTrue() {
    assertTrue(CommonSubstrings.SubstringTest("Something", "Home"));
  }

  @Test
  public void ShouldBeFalse() {
    assertFalse(CommonSubstrings.SubstringTest("Something", "Fun"));
  }

  @Test
  public void randTests() {
    assertTrue(CommonSubstrings.SubstringTest("zldNwKLheNmaWwlBxIqQobl", "hKCSBLAXhrxrIhCXFiuDeBF"));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchItUpTest {
  @Test
  public void basicTests() {
    assertEquals("One", SwitchItUp.switchItUp(1));
    assertEquals("Three", SwitchItUp.switchItUp(3));
    assertEquals("Five", SwitchItUp.switchItUp(5));
  }
}
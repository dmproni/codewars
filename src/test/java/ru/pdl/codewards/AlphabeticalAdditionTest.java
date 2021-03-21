package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlphabeticalAdditionTest {
  @Test
  public void fixedTests() {
    assertEquals("f", AlphabeticalAddition.addLetters("a", "b", "c"));
    assertEquals("z", AlphabeticalAddition.addLetters("z"));
    assertEquals("c", AlphabeticalAddition.addLetters("a", "b"));
    assertEquals("c", AlphabeticalAddition.addLetters("c"));
    assertEquals("a", AlphabeticalAddition.addLetters("z", "a"));
    assertEquals("d", AlphabeticalAddition.addLetters("y", "c", "b"));
    assertEquals("z", AlphabeticalAddition.addLetters());
  }
}
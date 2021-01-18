package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlphabetPositionSearcherTest {

  @Test
  public void basicTests() {
    assertEquals("Position of alphabet: 1", AlphabetPositionSearcher.position('a'));
    assertEquals("Position of alphabet: 26", AlphabetPositionSearcher.position('z'));
    assertEquals("Position of alphabet: 5", AlphabetPositionSearcher.position('e'));
  }

}
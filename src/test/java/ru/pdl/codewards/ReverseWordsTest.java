package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsTest {
  @Test
  public void testSomething() {
    assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
    assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
    assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
  }
}
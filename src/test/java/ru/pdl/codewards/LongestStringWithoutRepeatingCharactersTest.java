package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringWithoutRepeatingCharactersTest {

  private void test(int expected, String str) {
    Assertions.assertEquals(expected, LongestStringWithoutRepeatingCharacters.lengthOfLongestSubstring(str));
  }
  @Test
  public void test_00() {
    test(0, "");
    test(0, "    ");
    test(0, "    \t");
    test(0, null);
  }

  @Test
  public void test_01() {
    test(1, "a");
    test(1, "aaaa");
    test(1, "bb");
    test(1, "ddddddd");
  }
}
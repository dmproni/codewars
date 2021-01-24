package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFromAsciiValueTest {
  @Test
  public void testChar() {
    assertEquals('7', CharacterFromAsciiValue.getChar(55));
    assertEquals('8', CharacterFromAsciiValue.getChar(56));
    assertEquals('9', CharacterFromAsciiValue.getChar(57));
    assertEquals(':', CharacterFromAsciiValue.getChar(58));
    assertEquals(';', CharacterFromAsciiValue.getChar(59));
    assertEquals('<', CharacterFromAsciiValue.getChar(60));
    assertEquals('=', CharacterFromAsciiValue.getChar(61));
    assertEquals('>', CharacterFromAsciiValue.getChar(62));
    assertEquals('?', CharacterFromAsciiValue.getChar(63));
    assertEquals('@', CharacterFromAsciiValue.getChar(64));
    assertEquals('A', CharacterFromAsciiValue.getChar(65));
    assertEquals(0, Character.compare('!', CharacterFromAsciiValue.getChar(33)), "getChar should return a `char`");
  }
}
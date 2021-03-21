package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostValuableCharacterTest {
  @Test
  public void basicTests() {
    assertEquals('a', MostValuableCharacter.solve("a"));
    assertEquals('a', MostValuableCharacter.solve("aa"));
    assertEquals('b', MostValuableCharacter.solve("bcd"));
    assertEquals('x', MostValuableCharacter.solve("axyzxyz"));
    assertEquals('a', MostValuableCharacter.solve("dcbadcba"));
    assertEquals('c', MostValuableCharacter.solve("aabccc"));
    assertEquals('e', MostValuableCharacter.solve("efgefg"));
    assertEquals('e', MostValuableCharacter.solve("efghijefghi"));
    assertEquals('a', MostValuableCharacter.solve("acefacef"));
    assertEquals('a', MostValuableCharacter.solve("acefacefacef"));
  }
}
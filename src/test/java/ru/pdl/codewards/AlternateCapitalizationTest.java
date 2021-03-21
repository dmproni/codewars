package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AlternateCapitalizationTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, AlternateCapitalization.capitalize("abcdef"));
    assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, AlternateCapitalization.capitalize("codewars"));
    assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, AlternateCapitalization.capitalize("abracadabra"));
    assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, AlternateCapitalization.capitalize("codewarriors"));
  }
}
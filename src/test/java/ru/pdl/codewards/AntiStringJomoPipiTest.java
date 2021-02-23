package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntiStringJomoPipiTest {
  @Test
  public void Basic1() {
    assertEquals("a0", AntiStringJomoPipi.antiString("9Z"));
  }
  @Test
  public void Basic2() {
    assertEquals("aBc123", AntiStringJomoPipi.antiString("678XyZ"));
  }
  @Test
  public void Basic3() {
    assertEquals("678bcdXYZ", AntiStringJomoPipi.antiString("abcWXY123"));
  }
}
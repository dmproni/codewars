package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CorrectionOfTheTimeStringTest {

  @Test
  public void testNull() {
    assertNull(CorrectionOfTheTimeString.timeCorrect(null));
  }

  @Test
  public void testEmpty() {
    assertEquals("", CorrectionOfTheTimeString.timeCorrect(""));
  }

  @Test
  public void testCorrect() {
    Arrays.asList("09:10:01", "00:00:00", "23:59:59", "12:34:56")
      .forEach(s -> assertEquals(s, s));
  }

  @Test
  public void testCorrection() {
    assertEquals("12:10:10", CorrectionOfTheTimeString.timeCorrect("11:70:10"));
    assertEquals("20:39:09", CorrectionOfTheTimeString.timeCorrect("19:99:09"));
    assertEquals("20:40:39", CorrectionOfTheTimeString.timeCorrect("19:99:99"));
    assertEquals("00:01:01", CorrectionOfTheTimeString.timeCorrect("24:01:01"));
    assertEquals("04:01:01", CorrectionOfTheTimeString.timeCorrect("52:01:01"));
  }

  @Test
  public void testInvalidFormat() {
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("0:00:00"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("00:0:00"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("00:00:0"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("-0:00:00"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("00:00:000"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("000000"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("00;11;22"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect("00:00:0/"));
    assertEquals(null, CorrectionOfTheTimeString.timeCorrect(":0:00:00"));
  }

  @Test
  public void testEdgeCases() {
    assertEquals("00:00:00", CorrectionOfTheTimeString.timeCorrect("24:00:00"));
    assertEquals("00:00:00", CorrectionOfTheTimeString.timeCorrect("23:59:60"));
    assertEquals("00:00:00", CorrectionOfTheTimeString.timeCorrect("47:59:60"));
    assertEquals("00:00:59", CorrectionOfTheTimeString.timeCorrect("47:60:59"));
    assertEquals("12:00:00", CorrectionOfTheTimeString.timeCorrect("12:00:00"));
    assertEquals("04:40:39", CorrectionOfTheTimeString.timeCorrect("99:99:99"));
    assertEquals("01:00:00", CorrectionOfTheTimeString.timeCorrect("24:60:00"));
    assertEquals("01:00:00", CorrectionOfTheTimeString.timeCorrect("25:00:00"));
  }
}
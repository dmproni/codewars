package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeFormatterTest {
  @Test
  public void basicTests() {
    assertEquals("You're a(n) kid", AgeFormatter.describeAge(9));
    assertEquals("You're a(n) kid", AgeFormatter.describeAge(10));
    assertEquals("You're a(n) kid", AgeFormatter.describeAge(11));
    assertEquals("You're a(n) kid", AgeFormatter.describeAge(12));
    assertEquals("You're a(n) teenager", AgeFormatter.describeAge(13));
    assertEquals("You're a(n) teenager", AgeFormatter.describeAge(14));
    assertEquals("You're a(n) teenager", AgeFormatter.describeAge(15));
    assertEquals("You're a(n) teenager", AgeFormatter.describeAge(16));
    assertEquals("You're a(n) teenager", AgeFormatter.describeAge(17));
    assertEquals("You're a(n) adult", AgeFormatter.describeAge(18));
    assertEquals("You're a(n) adult", AgeFormatter.describeAge(19));
    assertEquals("You're a(n) adult", AgeFormatter.describeAge(63));
    assertEquals("You're a(n) adult", AgeFormatter.describeAge(64));
    assertEquals("You're a(n) elderly", AgeFormatter.describeAge(65));
    assertEquals("You're a(n) elderly", AgeFormatter.describeAge(66));
    assertEquals("You're a(n) elderly", AgeFormatter.describeAge(100));
  }
}
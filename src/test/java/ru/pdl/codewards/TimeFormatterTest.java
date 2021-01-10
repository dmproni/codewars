package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeFormatterTest {

  @Test
  void givenNegativeSeconds_ShouldReturnNull() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> TimeFormatter.formatDuration(-5));
  }

  @Test
  void givenZeroSeconds_ShouldReturnNow() {
    Assertions.assertEquals("now", TimeFormatter.formatDuration(0));
  }

  @Test
  void givenOnlySecond_ShouldReturnCorrectResult() {
    Assertions.assertEquals("1 second", TimeFormatter.formatDuration(1));
  }

  @Test
  void givenOnlySeconds_ShouldReturnCorrectResult() {
    Assertions.assertEquals("2 seconds", TimeFormatter.formatDuration(2));
  }

  @Test
  void givenOneMinute_ShouldReturnCorrectResult() {
    Assertions.assertEquals("1 minute", TimeFormatter.formatDuration(60));
  }

  @Test
  void givenFewMinutes_ShouldReturnCorrectResult() {
    Assertions.assertEquals("3 minutes", TimeFormatter.formatDuration(60 * 3));
  }

  @Test
  void givenFewMinutesAndSeconds_ShouldReturnCorrectResult() {
    Assertions.assertEquals("3 minutes and 15 seconds", TimeFormatter.formatDuration(60 * 3 + 15));
  }

  @Test
  void givenAnHour_ShouldReturnCorrectResult() {
    Assertions.assertEquals("1 hour", TimeFormatter.formatDuration(60 * 60));
  }

  @Test
  void givenFewHours_ShouldReturnCorrectResult() {
    Assertions.assertEquals("3 hours", TimeFormatter.formatDuration(60 * 60 * 3));
  }

  @Test
  void givenFewHoursAndMinutesAndSeconds_ShouldReturnCorrectResult() {
    Assertions.assertEquals("3 hours, 2 minutes and 25 seconds", TimeFormatter.formatDuration(60 * 60 * 3 + 2 * 60 + 25));
  }

  @Test
  void givenADay_ShouldReturnCorrectResult() {
    Assertions.assertEquals("1 day", TimeFormatter.formatDuration(60 * 60 * 24));
  }

  @Test
  void givenFewDaysAndSeconds_ShouldReturnCorrectResult() {
    Assertions.assertEquals("2 days, 1 hour, 3 minutes and 25 seconds",
      TimeFormatter.formatDuration(60 * 60 * 24 * 2 + 60 * 60 + 60 * 3 + 25));
  }

  @Test
  void givenAYear_ShouldReturnCorrectResult() {
    Assertions.assertEquals("1 year", TimeFormatter.formatDuration(60 * 60 * 24 * 365));
  }

  @Test
  void givenFewYearsAndSeconds_ShouldReturnCorrectResult() {
    Assertions.assertEquals("2 years and 31 seconds", TimeFormatter.formatDuration(60 * 60 * 24 * 365 * 2 + 31));
  }

}
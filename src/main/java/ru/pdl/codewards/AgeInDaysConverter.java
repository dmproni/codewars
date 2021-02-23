package ru.pdl.codewards;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AgeInDaysConverter {
  public static String ageInDays(int year, int month, int day) {
    final var birthday = LocalDate.of(year, month, day);
    final var today = LocalDate.now();
    final var daysBetween = ChronoUnit.DAYS.between(birthday, today);
    return "You are " + daysBetween + " days old";
  }

  public static void main(String[] args) {
  }
}
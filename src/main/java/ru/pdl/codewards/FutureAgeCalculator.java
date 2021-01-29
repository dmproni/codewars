package ru.pdl.codewards;

public class FutureAgeCalculator {
  public static String CalculateAge(int birth, int yearTo) {
    if (birth == yearTo) return "You were born this very year!";
    final var yearsBetween = Math.abs(birth - yearTo);
    final var yearsClause = "year" + (yearsBetween > 1 ? "s" : "");
    final var startClause = birth > yearTo ? "You will be born in" : "You are";
    final var endingClause = birth < yearTo ? " old" : "";
    return String.format("%s %d %s%s.", startClause, yearsBetween, yearsClause, endingClause);
  }
}

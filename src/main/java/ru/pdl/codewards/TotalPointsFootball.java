package ru.pdl.codewards;

import java.util.Arrays;

public class TotalPointsFootball {

  public static int points(String[] games) {
    return Arrays.stream(games)
      .map(v -> v.split(":"))
      .map(v -> Integer.parseInt(v[0]) - Integer.parseInt(v[1]))
      .filter(v -> v >= 0)
      .mapToInt(v -> v > 0 ? 3 : 1)
      .sum();
  }

}

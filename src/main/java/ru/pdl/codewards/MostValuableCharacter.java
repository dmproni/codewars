package ru.pdl.codewards;

import java.util.stream.Collectors;

public class MostValuableCharacter {
  public static char solve(String s) {
    return s.codePoints()
      .mapToObj(v -> (char) v)
      .distinct()
      .collect(Collectors.toMap(v -> v, v -> s.lastIndexOf(v) - s.indexOf(v)))
      .entrySet().stream()
      .sorted((v1, v2) -> -(v1.getValue() - v2.getValue()))
      .findFirst()
      .map(v -> v.getKey())
      .orElseThrow();
  }
}

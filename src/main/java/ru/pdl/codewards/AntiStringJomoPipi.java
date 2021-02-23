package ru.pdl.codewards;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AntiStringJomoPipi {
  public static String antiString(String str) {
    final var result = new StringBuilder();
    for (char c : str.toCharArray())
      result.append(Character.isDigit(c) ? opposite(c, '5') : reverseLetter(c));
    return result.reverse().toString();
  }

  private static char opposite(final char c, final char middle) {
    return (char) (c + (middle - c) * 2 - 1);
  }

  private static char reverseLetter(final char c) {
    final var t = opposite(c, Character.isLowerCase(c) ? 'n' : 'N');
    return Character.isLowerCase(c) ? Character.toUpperCase(t) : Character.toLowerCase(t);
  }

  public boolean checkThreeAndTwo(char[] chars) {
    final var grouped = IntStream.rangeClosed(0, chars.length)
      .mapToObj(i -> chars[i])
      .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
    return grouped.size() == 2 && grouped.values().stream().allMatch(v -> v > 1);
  }
}

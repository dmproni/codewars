package ru.pdl.codewards;

public class AlternateCapitalization {
  public static String[] capitalize(String s) {
    final var r1 = new StringBuilder();
    final var r2 = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      final var current = s.charAt(i);
      final var uppered = Character.toUpperCase(current);
      r1.append(i % 2 == 0 ? uppered : current);
      r2.append(i % 2 == 1 ? uppered : current);
    }
    return new String[]{r1.toString(), r2.toString()};
  }
}

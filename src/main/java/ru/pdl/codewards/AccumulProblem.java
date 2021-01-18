package ru.pdl.codewards;

public class AccumulProblem {

  public static String accum(String s) {
    final var result = new StringBuilder();
    final var chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      for (int n = 0; n < i + 1; n++) {
        final char temp = n == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
        result.append(temp);
      }
      if (i < chars.length - 1) result.append('-');
    }

    return result.toString();
  }

}

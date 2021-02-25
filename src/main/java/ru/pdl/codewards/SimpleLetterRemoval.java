package ru.pdl.codewards;

public class SimpleLetterRemoval {
  public static String solve(String s, int k) {
    int removed = 0;
    char charToRemove = 'a';

    final var sb = new StringBuilder(s);
    while (k > removed && charToRemove <= 'z') {
      final var index = sb.indexOf(String.valueOf(charToRemove));
      if (index >= 0) {
        sb.deleteCharAt(index);
        removed++;
      } else {
        charToRemove = (char) ((int) charToRemove + 1);
      }
    }

    return sb.toString();
  }
}

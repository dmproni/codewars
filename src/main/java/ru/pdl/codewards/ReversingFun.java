package ru.pdl.codewards;

public class ReversingFun {
  public static String funReverse(final String s) {
    final var chars = s.toCharArray();
    int i = 0;
    while (i < s.length() - 1) {
      reverse(chars, i++);
    }
    return new String(chars);
  }

  private static void reverse(final char[] chars, final int start) {
    final var half = (chars.length - start) / 2 + start;
    for (int i = start; i < half; i++) {
      final var j = chars.length - i - 1 + start;
      final var temp = chars[j];
      chars[j] = chars[i];
      chars[i] = temp;
    }
  }

}

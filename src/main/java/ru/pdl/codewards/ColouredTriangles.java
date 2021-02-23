package ru.pdl.codewards;

public class ColouredTriangles {
  private static final char[] RGB = new char[]{'R', 'G', 'B'};

  public static char triangle(final String row) {
    var current = row.toCharArray();
    while (current.length > 1)
      current = generateNext(current);
    return current[0];
  }

  private static char[] generateNext(final char[] chars) {
    final var result = new char[chars.length - 1];
    for (int i = 0; i < chars.length - 1; i++)
      result[i] = calcNextColour(chars[i], chars[i + 1]);
    return result;
  }

  private static char calcNextColour(final char a, final char b) {
    if (a == b) return a;
    for (char c : RGB)
      if (c != a && c != b)
        return c;
    return b;
  }
}

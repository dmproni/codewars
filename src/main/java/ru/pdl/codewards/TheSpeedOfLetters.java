package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TheSpeedOfLetters {
  public static String speedify(final String input) {
    final List<Character> list = new ArrayList<>();
    final char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++)
      add(list, i + chars[i] - 65, chars[i]);
    return list.stream().map(v -> String.valueOf(v)).collect(Collectors.joining());
  }

  private static void add(final List<Character> list, final int index, final Character character) {
    while (list.size() <= index) list.add(' ');
    list.set(index, character);
  }
}

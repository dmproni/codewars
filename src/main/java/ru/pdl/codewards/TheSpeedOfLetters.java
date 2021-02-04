package ru.pdl.codewards;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

  private static Stream<LocalDate> datesOfYear(final LocalDate init) {
    return init.datesUntil(init.plusYears(1));
  }

  public static void main(String[] args) {
    long count = datesOfYear(LocalDate.of(1986, Month.JANUARY, 1))
      .filter(v -> v.getDayOfWeek() == DayOfWeek.FRIDAY && v.getDayOfMonth() == 13)
      .count();
    System.out.println(count);
  }
}

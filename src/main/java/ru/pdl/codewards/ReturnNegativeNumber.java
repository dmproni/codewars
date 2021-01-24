package ru.pdl.codewards;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class ReturnNegativeNumber {
  private static final Map<String, String> MAP = ofEntries(
    entry("english", "Welcome"),
    entry("czech", "Vitejte"),
    entry("danish", "Velkomst"),
    entry("dutch", "Welkom"),
    entry("estonian", "Tere tulemast"),
    entry("finnish", "Tervetuloa"),
    entry("flemish", "Welgekomen"),
    entry("french", "Bienvenue"),
    entry("german", "Willkommen"),
    entry("irish", "Failte"),
    entry("italian", "Benvenuto"),
    entry("latvian", "Gaidits"),
    entry("lithuanian", "Laukiamas"),
    entry("polish", "Witamy"),
    entry("spanish", "Bienvenido"),
    entry("swedish", "Valkommen"),
    entry("welsh", "Croeso")
  );

  public static int makeNegative(final int x) {
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(convertToCelsius("6920936"));
  }

  public static String convertToCelsius(String s) {
    final var result = new StringBuilder();
    for (char re : s.toCharArray()) {
      result.append(re < '5' ? '0' : '1');
    }
    return result.toString();
  }

}

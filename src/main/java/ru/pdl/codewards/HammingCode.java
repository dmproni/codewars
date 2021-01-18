package ru.pdl.codewards;

import java.util.stream.Collectors;

public class HammingCode {
  private static final String EIGHT_ZEROS = "00000000";

  private static String leftPadTo8(final String binary) {
    return EIGHT_ZEROS.substring(0, 8 - binary.length()) + binary;
  }

  private static String tripleEverySymbol(final String str) {
    final var result = new StringBuilder();
    for (char c : str.toCharArray()) {
      result.append(String.valueOf(c).repeat(3));
    }
    return result.toString();
  }

  private static String checkAndCorrect(final String encoded) {
    final var result = new StringBuilder();

    if (encoded.length() % 3 == 0) {
      final var chars = encoded.toCharArray();
      for (int i = 0; i < chars.length; i += 3) {
        result.append(calculateChar(chars[i], chars[i + 1], chars[i + 2]));
      }
    }
    return result.toString();
  }

  private static char calculateChar(final char first, final char second, final char third) {
    return first == second || first == third ? first : second;
  }

  public String encode(String text) {
    return text.chars()
      .mapToObj(Integer::toBinaryString)
      .map(v -> leftPadTo8(v))
      .map(v -> tripleEverySymbol(v))
      .collect(Collectors.joining());
  }

  public String decode(final String bits) {
    final var result = new StringBuilder();
    final var corrected = checkAndCorrect(bits);
    final var correctedLength = corrected.length();
    for (int i = 0; i < correctedLength / 8; i++) {
      final var temp = corrected.substring(i * 8, i * 8 + 8);
      final var res = Integer.parseInt(temp, 2);
      result.append((char) res);
    }
    return result.toString();
  }

}

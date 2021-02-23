package ru.pdl.codewards;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonSubstrings {
  private static final String PASS = "password=";

  public static boolean SubstringTest(final String str1, final String str2) {
    final var list = toList(str1.toLowerCase());
    list.retainAll(toList(str2.toLowerCase()));
    return list.size() > 0;
  }

  private static List<String> toList(final String str) {
    return IntStream.range(0, str.length() - 1)
      .mapToObj(i -> str.substring(i, i + 2))
      .collect(Collectors.toList());
  }

  public static String hidePasswordFromConnection(String urlString) {
    System.out.println(urlString);

    final var startIndex = urlString.indexOf(PASS) + PASS.length();
    final var endIndex = urlString.indexOf("&", startIndex);

    final var start = urlString.substring(0, startIndex);
    final var end = endIndex == -1 ? "" : urlString.substring(endIndex);

    final var asteriskLength = urlString.length() - (start.length() + end.length());

    return start + "*".repeat(asteriskLength) + end;
  }
}

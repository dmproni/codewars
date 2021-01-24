package ru.pdl.codewards;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HowDoICompare {

  public static String tripleTrouble(String one, String two, String three) {
    final var result = new StringBuilder();
    for (int i = 0; i < one.length(); i++) {
      result.append(one.charAt(i));
      result.append(two.charAt(i));
      result.append(three.charAt(i));
    }
    return result.toString();
  }
}

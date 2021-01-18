package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

  public static String reverseWords(String str) {
    final var list = new ArrayList<>(Arrays.asList(str.split("\\s+")));
    Collections.reverse(list);
    return String.join(" ", list);
  }

}

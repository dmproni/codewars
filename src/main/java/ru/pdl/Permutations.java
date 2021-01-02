package ru.pdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {
  public static List<String> singlePermutations(String s) {
    if (s == null) {
      return null;
    } else if (s.isBlank()) {
      return Collections.EMPTY_LIST;
    } else if (s.length() == 1) {
      return Collections.singletonList(s);
    } else if (s.length() == 2) {
      return Arrays.asList(s, new StringBuilder(s).reverse().toString());
    }


    return null;
  }
}

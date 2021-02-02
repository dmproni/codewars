package ru.pdl.codewards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HeadIsAtTheWrongEnd {
  private static final List<String> LIST = Arrays.asList(
    "head", "heads", "body", "tail", "tails",
    "top", "middle", "bottom",
    "upper legs", "torso", "lower legs",
    "sky", "rainbow", "ground",
    "Falco", "Souther"
  );

  public static String[] fixTheMeerkat(String[] arr) {
    return Arrays.stream(arr)
      .sorted(Comparator.comparingInt(LIST::indexOf)).toArray(String[]::new);
  }

}

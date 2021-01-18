package ru.pdl.codewards;

import java.util.Map;

public class SwitchItUp {
  private static final Map<Integer, String> NUMBER_NAMES = Map.of(
    0, "Zero",
    1, "One",
    2, "Two",
    3, "Three",
    4, "Four",
    5, "Five",
    6, "Six",
    7, "Seven",
    8, "Eight",
    9, "Nine"
  );

  public static String switchItUp(int number) {
    return NUMBER_NAMES.get(number);
  }

}

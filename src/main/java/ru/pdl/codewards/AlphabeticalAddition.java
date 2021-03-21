package ru.pdl.codewards;

public class AlphabeticalAddition {
  public static String addLetters(String... letters) {
    if (letters == null || letters.length == 0) return "z";
    int sum = 0;
    for (String s : letters) {
      sum += s.charAt(0) - 'a' + 1;
    }
    return String.valueOf((char) ((sum > 26 ? sum % 26 : sum) + 'a' - 1));
  }

}

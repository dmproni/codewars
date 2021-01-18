package ru.pdl;

public class MyTestClass {
  // ("a", "b") => true
// ("aa", "bb") => false
// ("aa", "aba") => true

  public static boolean check(final String first, final String second) {
    if (Math.abs(first.length() - second.length()) > 1) {
      return false;
    }

    final var strFirst = first.length() > second.length() ? second : first;
    final var strSecond = first.length() > second.length() ? first : second;

    final var arr = first.toCharArray();

    int count = 0;
    int seocndIndex = 0;
    for (int i = 0; i < strFirst.length(); i++) {
      if (strFirst.charAt(i) != strSecond.charAt(i)) {
        count++;
      }
    }
//    return count <= 1;
    if (first.length() != second.length() && count == 1) {
      return false;
    }
    return (first.length() == second.length() && count <= 1) || ((first.length() != second.length() && count <= 1));
  }

  public static void main(String[] args) {
    System.out.println(check("a", "b") == true);
    System.out.println(check("aa", "bb") == false);
    System.out.println(check("aa", "aba") == true);
    System.out.println(check("abcd", "abed") == true);
    System.out.println(check("aba", "aa") == true);
    System.out.println(check("a", "aaa") == false);
    System.out.println(check("abcd", "abedg") == false);
  }
}

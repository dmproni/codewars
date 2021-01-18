package ru.pdl.codewards;

public class ReversedStrings {

  public static String solution(String str) {
    return str == null ? null : new StringBuilder(str).reverse().toString();
  }

}

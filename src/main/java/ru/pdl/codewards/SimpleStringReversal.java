package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleStringReversal {
  public static String solve(String s) {
    final var result = new StringBuilder(s.replaceAll(" ", "")).reverse();
    final var chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ' ') result.insert(i, chars[i]);
    }
    return result.toString();
  }

  public static String solve(String s, int k) {
    String result = s;
    final var chars = "bcdefghijklmnopqrstuvwxyz".toCharArray();
    for (int i = 0; i < chars.length && i < k; i++) {
      result = result.replaceFirst("a" + chars[i], String.valueOf(chars[i]));
    }
    return result;
  }


  public static void main(String[] args) {
    System.out.println(6/2 + 6%2);

    final var r = new ArrayList<Integer>();
    final var g = r.stream().mapToInt(v -> v).toArray();

    var s = "lskdfjkldjf";
    var gs = s.toCharArray();
  }
}

package ru.pdl.codewards;

import java.util.Arrays;

public class UltimateArrayReverser {

  public static String[] reverse(String[] a) {
    System.out.println(Arrays.toString(a));

    final var builder = new StringBuilder();
    for (String s : a)
      builder.append(s);
    final var reversedStr = builder.reverse().toString();

    final var result = new String[a.length];

    int start = 0;
    for (int i = 0; i < result.length; i++) {
      final var end = start + a[i].length();
      result[i] = reversedStr.substring(start, end);
      start = end;
    }

    System.out.println(Arrays.toString(result));

    return result;
  }

}

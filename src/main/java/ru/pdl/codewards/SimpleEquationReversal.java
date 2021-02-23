package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SimpleEquationReversal {

  public static String solve(String eq) {

    for (char c : eq.toCharArray()) {
      if (!in(c, '+', '-', '/', '*')) {

      }
    }

    return null;
  }

  private static boolean in(final char target, final char... chars) {
    for (char aChar : chars)
      if (aChar == target)
        return true;
    return false;
  }

  public static void main(String[] args) {
    final var ints = new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8};
    Arrays.sort(ints, 2, 9);
    System.out.println(Arrays.toString(ints));

    Collection<Character> a = new ArrayList<>();
    Collection<Character> b = new ArrayList<>();

    var alist = new ArrayList<>(a);
    var blist = new ArrayList<>(b).removeAll(a);
  }

  private static <T>  Stream<T> rem(final Collection<T> t1, final Collection<T> t2) {
    final var copy = new ArrayList<>(t1);
    copy.removeAll(t2);
    return copy.stream();
  }

}

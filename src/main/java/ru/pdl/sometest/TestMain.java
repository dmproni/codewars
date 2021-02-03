package ru.pdl.sometest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain {
  public static void main(String[] args) {
    var s = new String[]{"one", "two", "three"};
    var b = (Object[]) s;
    b[2] = "dfkj";
    System.out.println(Arrays.toString(b));

    List<String> s1 = new ArrayList<>();
    s1.add("first");
    s1.add("second");
    s1.add("thrid");

    List<?> some = s1;
    List<?> some2 = (List<?>) s1;

    System.out.println(some2);

    var t = s1.stream().map(v -> (Object) v).collect(Collectors.toList());
    t.add(5);
    System.out.println(t);
  }
}

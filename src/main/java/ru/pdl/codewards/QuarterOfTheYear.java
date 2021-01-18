package ru.pdl.codewards;

import java.util.stream.IntStream;

public class QuarterOfTheYear {

  public static int quarterOf(int month) {
    return ((month - 1) / 3) + 1;
  }

  public static void main(String[] args) {
    IntStream.rangeClosed(1, 12).forEach(v -> System.out.println(v + ": " + ((v - 1) / 3) + 1));
  }

}

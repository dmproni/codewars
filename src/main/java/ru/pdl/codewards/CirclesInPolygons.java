package ru.pdl.codewards;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CirclesInPolygons {
  int sides;
  int sideLength;

  public CirclesInPolygons(int sides, int sideLength) {
    this.sides = sides;
    this.sideLength = sideLength;
  }

  public double circleDiameter(){
    final var radius = sideLength / (2 * Math.tan(Math.PI / sides));
    return radius * 2;
  }

  public static void main(String[] args) {
    var r1 = " lksjdf";
    var r2 = "lkzlksjdflkj2";
    var r = IntStream.concat(r1.codePoints(), r2.codePoints())
      .mapToObj(v -> (char) v)
      .map(v -> v.toString())
      .distinct()
      .sorted()
      .collect(Collectors.joining());
    System.out.println(r);

    final var x = IntStream.rangeClosed(1, 10).summaryStatistics();
    var g = new StringBuilder();
    System.out.println(x);
  }
}

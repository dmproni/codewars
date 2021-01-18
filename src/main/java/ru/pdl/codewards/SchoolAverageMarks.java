package ru.pdl.codewards;

import java.util.Arrays;

public class SchoolAverageMarks {

  public static int getAverage(int[] marks) {
    return (int) Arrays.stream(marks).average().orElseThrow();
  }

}

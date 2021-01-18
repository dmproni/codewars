package ru.pdl.codewards;

public class ClockMillisecondsAfterMidnight {

  public static int Past(int h, int m, int s) {
    return (s + (m + h * 60) * 60) * 1000;
  }

}

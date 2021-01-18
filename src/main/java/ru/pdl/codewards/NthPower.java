package ru.pdl.codewards;

public class NthPower {

  public static int nthPower(int[] array, int n) {
    return (n <= 0 || n >= array.length) ? -1 : (int) Math.pow(array[n], n);
  }

}

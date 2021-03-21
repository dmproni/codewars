package ru.pdl.codewards;

public class Test301 {
  public static int testTrueFalse(int n) {
    if (n < 2) return n;
    if (n < 4) return n - 1;
    if (n < 7) return (int) Math.round(n / 3.0);
    return Integer.toBinaryString(n).replace("0", "").length();
  }
}

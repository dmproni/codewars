package ru.pdl.codewards;

public class ConsecutiveDucks {
  public static boolean consecutiveDucks(int n) {
    while (n > 2) {
      if (n % 2 == 1) return true;
      n /= 2;
    }
    return false;
  }

  public static void main(String[] args) {
    final var i = 5;
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.bitCount(i));
  }
}

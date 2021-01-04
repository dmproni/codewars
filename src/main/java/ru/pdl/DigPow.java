package ru.pdl;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 */
public class DigPow {
  public static long digPow(int n, int p) {
    long result = 0;
    int nCopy = n;
    for (int i = String.valueOf(nCopy).length() - 1 + p; i >= p; i--) {
      result += Math.pow(nCopy % 10, i);
      nCopy /= 10;
    }
    return result % n == 0 ? result / n : -1;
  }

  public static void main(String[] args) {
    System.out.println(digPow(89, 1));
    System.out.println(53 % 10);
    System.out.println(53 / 10);
  }
}

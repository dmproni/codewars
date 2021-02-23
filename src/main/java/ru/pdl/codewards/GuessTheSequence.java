package ru.pdl.codewards;

public class GuessTheSequence {
  static int[] sequence(int x) {
    final var result = new int[x];
    int index = 0;
    for (int i = 1; i <= 9; i++) {
      result[index++] = i;
      for (int j = i * 10; j <= x && j < (i + 1) * 10; j++)
        result[index++] = j;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Integer.toString(28, 15));
  }
}

package ru.pdl.codewards;

public class PalindromeCreation {

  public static boolean solve(String str) {
    for (int i = 0; i < str.length() / 2; i++)
      if (!canBeMatched(str.charAt(i), str.charAt(str.length() - i - 1)))
        return false;

    return true;
  }

  private static int[] possibles(final int i) {
    return i == 'a' ? new int[]{i + 1} : i == 'z' ? new int[]{i - 1} : new int[]{i - 1, i + 1};
  }

  private static boolean canBeMatched(final int a, final int b) {
    for (var possibleA : possibles(a))
      for (var possibleB : possibles(b))
        if (possibleA == possibleB)
          return true;

    return false;
  }

}

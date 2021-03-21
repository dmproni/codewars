package ru.pdl.codewards;

public class LongestStringWithoutRepeatingCharacters {
  public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.isBlank()) return 0;

    int max = 0;
    char[] str = s.toCharArray();

    for (int i = 0; i < s.length() - 1; i++) {
      int localMax = rec(str, i + 1, find(str, i, s.length(), str[i]));
      if (localMax > max)
        max = localMax;
    }

    return max;
  }

  private static int rec(char[] str, int from, int to) {
    if (to - from == 1 || to == from)
      return 1;
    int end = find(str, from, to, str[from]);
    return rec(str, from + 1, end) + 1;
  }

  private static int find(char[] str, int from, int to, char target) {
    for (int i = from; i < to; i++)
      if (str[i] == target)
        return i;
    return to;
  }
}

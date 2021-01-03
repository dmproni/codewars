package ru.pdl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
  public static List<String> singlePermutations(String s) {
    if (s == null) {
      return null;
    }

    final Set<String> result = new HashSet<>();

    if (!s.isBlank()) {
      final char[] possibleChars = s.toCharArray();
      final char[] fixedChars = new char[possibleChars.length];

      process(result, fixedChars, possibleChars, 0);
    }

    return new ArrayList<>(result);
  }

  private static void process(final Set<String> result, final char[] fixedChars, final char[] possibleChars, final int index) {
    if (index == fixedChars.length - 1) {
      for (char possibleChar : possibleChars) {
        fixedChars[index] = possibleChar;
        result.add(new String(fixedChars));
      }
    } else {
      for (char possibleChar : possibleChars) {
        fixedChars[index] = possibleChar;
        final char[] newPossibleChars = newPossibleChars(possibleChars, possibleChar);
        process(result, fixedChars, newPossibleChars, index + 1);
      }
    }
  }

  private static char[] newPossibleChars(final char[] oldPossibleChars, final char characterToRemove) {
    final char[] newPossibleChars = new char[oldPossibleChars.length - 1];
    boolean occurrenceFound = false;
    int currentIndex = 0;
    for (char oldPossibleChar : oldPossibleChars) {
      if (!occurrenceFound && oldPossibleChar == characterToRemove) {
        occurrenceFound = true;
        continue;
      } else {
        newPossibleChars[currentIndex++] = oldPossibleChar;
      }
    }
    return newPossibleChars;
  }

}

package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SecretDetective {

  private static Set<Character> getDistinctLetters(final char[][] triplets) {
    final Set<Character> result = new HashSet<>();
    for (char[] triplet : triplets) {
      for (char c : triplet) {
        result.add(c);
      }
    }
    return result;
  }

  public static boolean sortIfNeeded(final List<Character> characters, final char first, final char second) {
    final int firstIndex = characters.indexOf(first);
    final int secondIndex = characters.indexOf(second);
    if (firstIndex > secondIndex) {
      characters.set(firstIndex, second);
      characters.set(secondIndex, first);
      return true;
    }
    return false;
  }

  public String recoverSecret(char[][] triplets) {
    final List<Character> distinctLetters = new ArrayList<>(getDistinctLetters(triplets));
    boolean atLeastOnePermutationOccurred = true;
    while (atLeastOnePermutationOccurred) {
      atLeastOnePermutationOccurred = false;
      for (char[] triplet : triplets) {
        for (int i = 0; i < triplet.length - 1; i++) {
          if (sortIfNeeded(distinctLetters, triplet[i], triplet[i + 1])) {
            atLeastOnePermutationOccurred = true;
          }
        }
      }
    }

    return distinctLetters.stream().map(String::valueOf).collect(Collectors.joining());
  }

}

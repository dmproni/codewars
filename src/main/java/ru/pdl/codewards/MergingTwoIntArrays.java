package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.List;

public class MergingTwoIntArrays {

  public static int[] mergeArrays(int[] first, int[] second) {
    final List<Integer> result = new ArrayList<>();
    int firstIndex = 0, secondIndex = 0;

    while (firstIndex < first.length || secondIndex < second.length) {
      final var firstCurrentElement = firstIndex < first.length ? first[firstIndex] : Integer.MAX_VALUE;
      final var secondCurrentElement = secondIndex < second.length ? second[secondIndex] : Integer.MAX_VALUE;
      final int smallest = firstCurrentElement <= secondCurrentElement ? firstCurrentElement : secondCurrentElement;

      final Integer lastElement = result.size() > 0 ? result.get(result.size() - 1) : null;
      if (lastElement == null || lastElement != smallest) {
        result.add(smallest);
      }

      firstIndex += firstCurrentElement <= secondCurrentElement ? 1 : 0;
      secondIndex += secondCurrentElement <= firstCurrentElement ? 1 : 0;
    }

    var r = "sldkjf";
    r.matches("^([a-z]|[0-9]|_){4,16}$");

    return result.stream().mapToInt(v -> v).toArray();
  }
}

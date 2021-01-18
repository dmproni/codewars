package ru.pdl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class TinkoffTask3 {
  public static void main(String[] args) {
    final var ints = new int[][]{{1, 5, 7}, {2, 6, 9}, {3, 4, 8}};
    final var result = sort(ints);
    System.out.println(Arrays.toString(result));
  }

  public static int[] sort(int[][] arr) {
    Queue<List<Integer>> queue = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
      queue.add(Arrays.stream(arr[i]).boxed().collect(Collectors.toList()));
    }

    while (queue.size() > 1) {
      queue.add(merge(queue.poll(), queue.poll()));
    }

    return queue.poll().stream().mapToInt(v -> v).toArray();
  }

  public static List<Integer> merge(List<Integer> first, List<Integer> second) {
    final var result = new ArrayList<Integer>(first.size() + second.size());

    int firstIndex = 0;
    int secondIndex = 0;

    while (firstIndex < first.size() && secondIndex < second.size()) {
      final var f = first.get(firstIndex);
      final var s = second.get(secondIndex);
      if (f < s) {
        result.add(f);
        firstIndex++;
      } else {
        result.add(s);
        secondIndex++;
      }
    }

    if (firstIndex < first.size()) {
      for (int i = firstIndex; i < first.size(); i++) {
        result.add(first.get(i));
      }
    }

    if (secondIndex < second.size()) {
      for (int i = secondIndex; i < second.size(); i++) {
        result.add(second.get(i));
      }
    }

    return result;
  }

}

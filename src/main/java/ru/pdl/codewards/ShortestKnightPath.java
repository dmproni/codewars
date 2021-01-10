package ru.pdl.codewards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortestKnightPath {
  private static final char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
  private static final int[][] possibleMoves = new int[][]{{-2, -1}, {-2, 1}, {-1, -2}, {-1, +2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

  public static int knight(String start, String finish) {
    return start.equals(finish) ? 0 : countMoves(getPossiblePositions(start), new HashSet<>(), finish);
  }

  private static int countMoves(final Set<String> moves, final Set<String> triedMoves, final String target) {
    if (moves.contains(target)) {
      return 1;
    } else {
      final Set<String> newMoves = new HashSet<>();
      for (String move : moves) {
        if (triedMoves.contains(move)) {
          continue;
        }
        newMoves.addAll(getPossiblePositions(move));
      }
      triedMoves.addAll(moves);
      return countMoves(newMoves, triedMoves, target) + 1;
    }
  }

  public static Set<String> getPossiblePositions(final String position) {
    final int x = Arrays.binarySearch(letters, position.charAt(0));
    final int y = Integer.valueOf(position.substring(1)) - 1;
    final Set<String> result = new HashSet<>();

    for (int[] possibleMove : possibleMoves) {
      final int possibleX = x + possibleMove[0];
      if (possibleX >= 0 && possibleX <= 7) {
        final int possibleY = y + possibleMove[1];
        if (possibleY >= 0 && possibleY <= 7) {
          result.add(String.format("%s%d", letters[possibleX], possibleY + 1));
        }
      }
    }
    return result;
  }

}

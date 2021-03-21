package ru.pdl.codewards;

public class TvRemoteTask {
  private static final char[][] remote = new char[][]{
    new char[]{'a', 'b', 'c', 'd', 'e', '1', '2', '3'},
    new char[]{'f', 'g', 'h', 'i', 'j', '4', '5', '6'},
    new char[]{'k', 'l', 'm', 'n', 'o', '7', '8', '9'},
    new char[]{'p', 'q', 'r', 's', 't', '.', '@', '0'},
    new char[]{'u', 'v', 'w', 'x', 'y', 'z', '_', '/'}
  };

  public static int tvRemote(final String word) {
    int[] current = new int[]{0, 0};

    final var chars = word.toCharArray();
    int presses = 0;

    for (final char r : chars) {
      final var location = locate(r);
      final var distance = Math.abs(current[0] - location[0]) + Math.abs(current[1] - location[1]);
      presses += distance + 1;
      current = location;
    }

    return presses;
  }

  public static int[] locate(final char r) {
    for (int y = 0; y < remote.length; y++)
      for (int x = 0; x < remote[0].length; x++)
        if (remote[y][x] == r)
          return new int[]{x, y};
    throw new IllegalArgumentException("char " + r + " is not on the tv remote!");
  }
}

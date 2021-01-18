package ru.pdl;

public class TinkoffTask2 {
  public static void main(String[] args) {
    // only horizontal
    System.out.println(countShips(new int[][]{{0, 1, 1}, {0, 0, 0}, {0, 1, 0}}) == 2);
    System.out.println(countShips(new int[][]{{1, 0, 1}, {0, 0, 0}, {0, 1, 0}}) == 3);

    // only vertical
    System.out.println(countShips(new int[][]{{0, 0, 1}, {1, 0, 1}, {1, 0, 0}}) == 2);
    System.out.println(countShips(new int[][]{{1, 0, 0}, {1, 0, 1}, {0, 0, 0}}) == 2);

    // horizontal + vertical
    System.out.println(countShips(new int[][]{{1, 0, 0, 0}, {1, 0, 1, 1}, {0, 0, 0, 0}, {1, 0, 1, 0}}) == 4);
  }

  public static int countShips(final int[][] field) {
    final var fieldSize = field.length;

    int count = 0;
    for (int y = 0; y < fieldSize; y++) {
      for (int x = 0; x < fieldSize; x++) {
        if (field[y][x] == 1) {
          if ((x == 0 || field[y][x - 1] != 1) && (y == 0 || field[y - 1][x] != 1)) {
            count++;
          }
        }
      }
    }

    return count;
  }

}

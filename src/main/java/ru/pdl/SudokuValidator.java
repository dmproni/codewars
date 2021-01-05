package ru.pdl;

import java.util.Arrays;

public class SudokuValidator {
  public static boolean check(int[][] sudoku) {
    if (sudoku.length != 9 || sudoku[0].length != 9) {
      throw new UnsupportedOperationException();
    }
    return checkRows(sudoku) && checkColumns(sudoku) && checkCubes(sudoku);
  }

  private static boolean checkCubes(final int[][] sudoku) {
    for (int i = 0; i < 9; i += 3) {
      for (int j = 0; j < 9; j += 3) {
        final int[] cube = extractCube(sudoku, i, j);
        if (!check(cube)) {
          return false;
        }
      }
    }
    return true;
  }

  private static int[] extractCube(final int[][] sudoku, final int rowIndex, final int columnIndex) {
    final int[] cube = new int[9];
    int currentIndex = 0;
    for (int i = rowIndex; i < rowIndex + 3; i++) {
      for (int j = columnIndex; j < columnIndex + 3; j++) {
        cube[currentIndex++] = sudoku[i][j];
      }
    }
    return cube;
  }

  private static boolean checkRows(final int[][] sudoku) {
    for (int i = 0; i < sudoku.length; i++) {
      if (!check(sudoku[i])) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkColumns(final int[][] sudoku) {
    for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
      if (!check(extractColumn(sudoku, columnIndex))) {
        return false;
      }
    }
    return true;
  }

  private static int[] extractColumn(final int[][] sudoku, final int columnIndex) {
    final int[] column = new int[9];
    for (int j = 0; j < 9; j++) {
      column[j] = sudoku[j][columnIndex];
    }
    return column;
  }

  private static boolean check(final int[] sudokuRow) {
    final int[] numCounts = new int[9];
    for (int i = 0; i < sudokuRow.length; i++) {
      final int sudokuNumber = sudokuRow[i];
      if (sudokuNumber < 1 || sudokuNumber > 9) {
        return false;
      }
      numCounts[sudokuNumber - 1]++;
    }
    for (int number : numCounts) {
      if (number == 0 || number > 1) {
        return false;
      }
    }
    return true;
  }
}

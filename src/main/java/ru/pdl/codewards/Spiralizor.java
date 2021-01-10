package ru.pdl.codewards;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Spiralizor {

  public static int[][] spiralize(int size) {
    final int[][] result = new int[size][size];

    int currentX = 0;
    int currentY = 0;

    int maxX = size - 1;
    int maxY = size - 1;
    int minY = 0;
    int minX = 0;

    Direction direction = Direction.RIGHT;

    while (true) {
      if (direction == Direction.RIGHT && currentX < maxX) {
        for (int x = currentX; x <= maxX; x++) {
          currentX = x;
          result[currentY][currentX] = 1;
        }
        minY += 2;
        currentY++;
        direction = nextDirection(direction);
      } else if (direction == Direction.DOWN && currentY <= maxY) {
        for (int y = currentY; y <= maxY; y++) {
          currentY = y;
          result[currentY][currentX] = 1;
        }
        maxX -= 2;
        currentX--;
        direction = nextDirection(direction);
      } else if (direction == Direction.LEFT && currentX > minX) {
        for (int x = currentX; x >= minX; x--) {
          currentX = x;
          result[currentY][currentX] = 1;
        }
        maxY -= 2;
        currentY--;
        direction = nextDirection(direction);
      } else if (direction == Direction.UP && currentY >= minY) {
        for (int y = currentY; y >= minY; y--) {
          currentY = y;
          result[currentY][currentX] = 1;
        }
        minX += 2;
        currentX++;
        direction = nextDirection(direction);
      } else {
        break;
      }
    }

    return result;
  }

  private static Direction nextDirection(final Direction direction) {
    final int inputIndex = direction.ordinal();
    return Direction.values()[inputIndex == Direction.values().length - 1 ? 0 : inputIndex + 1];
  }

  public static void main(String[] args) {
    IntStream.range(5, 10).forEach(s -> {
        Arrays.stream(Spiralizor.spiralize(s)).forEach(v ->
          System.out.println(Arrays.stream(v).mapToObj(String::valueOf).collect(Collectors.joining(" "))));
        System.out.println();
      }
    );
  }

  public enum Direction {
    RIGHT, DOWN, LEFT, UP
  }

}

package ru.pdl;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
 */
public class SnailSort {

  public static int[] snail(int[][] array) {
    if (array == null) {
      return null;
    }
    for (int[] ints : array) {
      if (ints.length != array.length) {
        throw new UnsupportedOperationException();
      }
    }
    if (array.length == 1) {
      return array[0];
    }

    final Cursor cursor = new Cursor(array.length - 1);
    int[] result = new int[array.length * array.length];
    int resultIndex = 0;

    while (resultIndex < result.length) {
      result[resultIndex++] = array[cursor.y][cursor.x];
      cursor.move();
    }

    return result;
  }

  private static DIRECTION switchDirection(final DIRECTION direction) {
    var inputIndex = direction.ordinal();
    var indexOfNextDirection = inputIndex == DIRECTION.values().length - 1 ? 0 : inputIndex + 1;
    return DIRECTION.values()[indexOfNextDirection];
  }

  private enum DIRECTION {
    RIGHT, DOWN, LEFT, UP
  }

  public static class Cursor {
    public Integer x, y, minX, minY = 0;
    public Integer maxX, maxY;
    public DIRECTION direction;

    public Cursor(final int maxXY) {
      this.maxX = maxXY;
      this.maxY = maxXY;
      this.minX = 0;
      this.minY = 0;
      this.y = 0;
      this.x = 0;
      this.direction = DIRECTION.RIGHT;
    }

    public void move() {
      if (direction == DIRECTION.RIGHT) {
        if (x < maxX) {
          x++;
        } else {
          minY++;
          y++;
          direction = SnailSort.switchDirection(direction);
        }
      } else if (direction == DIRECTION.DOWN) {
        if (y < maxY) {
          y++;
        } else {
          maxX--;
          x--;
          direction = SnailSort.switchDirection(direction);
        }
      } else if (direction == DIRECTION.LEFT) {
        if (x > minX) {
          x--;
        } else {
          maxY--;
          y--;
          direction = SnailSort.switchDirection(direction);
        }
      } else if (direction == DIRECTION.UP) {
        if (y > minY) {
          y--;
        } else {
          minX++;
          x++;
          direction = SnailSort.switchDirection(direction);
        }
      }
    }
  }

}

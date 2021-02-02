package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOf2NumbersWithinARangeTest {

  private static List<Integer> findMultiples(int s1, int s2, int s3) {
    return MultiplesOf2NumbersWithinARange.findMultiples(s1, s2, s3);
  }

  @Test
  public void testSomeValues14() {
    List<Integer> list1 = findMultiples(2, 4, 40);
    List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16, 20, 24, 28, 32, 36));
    assertEquals(list2, list1);
  }

  @Test
  public void testSomeValues() {
    List<Integer> list1 = findMultiples(5, 13, 800);
    List<Integer> list2 = new ArrayList<>(Arrays.asList(65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780));
    assertEquals(list2, list1);
  }

  @Test
  public void testSomeValues4() {
    List<Integer> list1 = findMultiples(7, 16, 1000);
    List<Integer> list2 = new ArrayList<>(Arrays.asList(112, 224, 336, 448, 560, 672, 784, 896));
    assertEquals(list2, list1);
  }

  @Test
  public void myTest1() {
    assertEquals(Arrays.asList(80, 160, 240, 320, 400, 480, 560, 640, 720, 800, 880, 960), findMultiples(20, 16, 1000));
  }
}
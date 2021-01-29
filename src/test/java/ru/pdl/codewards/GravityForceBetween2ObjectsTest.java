package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GravityForceBetween2ObjectsTest {

  private static void test(double expected, double[] arrVal, String[] arrUnit) {
    assertEquals(expected, GravityForceBetween2Objects.solution(arrVal, arrUnit), expected * 1e-5);
  }

  @Test
  public void sampleTests() {
    test(6.67e-12, new double[]{1000, 1000, 100}, new String[]{"g", "kg", "m"});
    test(6.67e-9, new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "m"});
    test(0.0000667, new double[]{1000, 1000, 100}, new String[]{"kg", "kg", "cm"});
  }

  @Test
  void additionalTest() {
    test(1.7048780300278574E-15, new double[]{186676.94045019665, 2.783838575823841E10, 3.1506586398319688E7}, new String[]{"lb", "mg", "ft"});
  }


}
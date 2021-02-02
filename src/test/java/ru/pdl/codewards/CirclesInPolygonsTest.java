package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CirclesInPolygonsTest {
  @Test
  public void test1() {
    //Square with sides of 5 units
    CirclesInPolygons poly = new CirclesInPolygons(4, 5);
    assertEquals("5.000", String.format("%.3f", poly.circleDiameter()));
  }

  @Test
  public void test2() {
    //Octogon with sides of 9 units
    CirclesInPolygons poly = new CirclesInPolygons(8, 9);
    assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
  }

  @Test
  public void test3() {
    //Triangle with sides of 4 units
    CirclesInPolygons poly = new CirclesInPolygons(3, 4);
    assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColouredTrianglesTest {

  @Test
  public void test1() {
    assertEquals('R', ColouredTriangles.triangle("GB"));
  }

  @Test
  public void test2() {
    assertEquals('R', ColouredTriangles.triangle("RRR"));
  }

  @Test
  public void test3() {
    assertEquals('B', ColouredTriangles.triangle("RGBG"));
  }

  @Test
  public void test4() {
    assertEquals('G', ColouredTriangles.triangle("RBRGBRB"));
  }

  @Test
  public void test5() {
    assertEquals('G', ColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
  }

  @Test
  public void test6() {
    assertEquals('B', ColouredTriangles.triangle("B"));
  }
}
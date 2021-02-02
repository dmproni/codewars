package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionMatterTest {
  @Test
  public void checkSmallValues() {
    assertEquals(6, ExpressionMatter.expressionsMatter(2, 1, 2));
    assertEquals(3, ExpressionMatter.expressionsMatter(1, 1, 1));
    assertEquals(4, ExpressionMatter.expressionsMatter(2, 1, 1));
    assertEquals(9, ExpressionMatter.expressionsMatter(1, 2, 3));
    assertEquals(5, ExpressionMatter.expressionsMatter(1, 3, 1));
    assertEquals(8, ExpressionMatter.expressionsMatter(2, 2, 2));
  }

  @Test
  public void checkIntermediateValues() {
    assertEquals(20, ExpressionMatter.expressionsMatter(5, 1, 3));
    assertEquals(105, ExpressionMatter.expressionsMatter(3, 5, 7));
    assertEquals(35, ExpressionMatter.expressionsMatter(5, 6, 1));
    assertEquals(8, ExpressionMatter.expressionsMatter(1, 6, 1));
    assertEquals(14, ExpressionMatter.expressionsMatter(2, 6, 1));
    assertEquals(48, ExpressionMatter.expressionsMatter(6, 7, 1));
  }

  @Test
  public void checkMixedValues() {
    assertEquals(60, ExpressionMatter.expressionsMatter(2, 10, 3));
    assertEquals(27, ExpressionMatter.expressionsMatter(1, 8, 3));
    assertEquals(126, ExpressionMatter.expressionsMatter(9, 7, 2));
    assertEquals(20, ExpressionMatter.expressionsMatter(1, 1, 10));
    assertEquals(18, ExpressionMatter.expressionsMatter(9, 1, 1));
    assertEquals(300, ExpressionMatter.expressionsMatter(10, 5, 6));
    assertEquals(12, ExpressionMatter.expressionsMatter(1, 10, 1));
  }
}
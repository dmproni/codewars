package ru.pdl.codewards;

public class ExpressionMatter {
  public static int expressionsMatter(int a, int b, int c) {
    return Math.max(Math.max(Math.max(a + b + c, a * b * c), (a + b) * c), a * (b + c));
  }
}

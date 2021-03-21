package ru.pdl.codewards;

public class BasicCalculator {
  public static Double calculate(final double n1, final String op, final double n2) {
    Double result = null;
    if (op.equals("+")) {
      result = n1 + n2;
    } else if (op.equals("-")) {
      result = n1 - n2;
    } else if (op.equals("*")) {
      result = n1 * n2;
      if (result == -0.0) result = 0.0;
    } else if (op.equals("/") && n2 != 0.0) {
      result = n1 / n2;
    }
    return result;
  }

}

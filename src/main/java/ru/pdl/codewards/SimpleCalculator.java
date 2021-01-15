package ru.pdl.codewards;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Create a simple calculator that given a string of operators (), +, -, *, / and numbers separated by spaces returns the value of that expression
 */
public class SimpleCalculator {
  private static final Map<Character, Operator> OPERATORS_MAP = Map.of(
    '+', Operator.ADDITION,
    '-', Operator.SUBTRACTION,
    '*', Operator.MULTIPLICATION,
    '/', Operator.DIVISION
  );

  public static Double evaluate(String expression) {
    System.out.println(expression);
    Queue<Token> output = new LinkedList<>();
    Stack<Operator> operatorsStack = new Stack<>();

    final var chars = expression.toCharArray();
    String tempNumber = null;
    for (int i = 0; i < chars.length; i++) {
      if (Character.isDigit(chars[i]) || chars[i] == '.' || chars[i] == 'E' || (chars[i] == '-' && Character.isDigit(chars[i + 1]))) {
        tempNumber = tempNumber == null ? String.valueOf(chars[i]) : tempNumber + chars[i];
      } else {
        if (tempNumber != null) {
          output.add(new Token(tempNumber, TokenType.NUMBER));
          tempNumber = null;
        }

        if (chars[i] == Operator.LEFT_PAREN.value) {
          operatorsStack.push(Operator.LEFT_PAREN);
        } else if (OPERATORS_MAP.containsKey(chars[i])) {
          final var currOperator = OPERATORS_MAP.get(chars[i]);
          while (!operatorsStack.empty()
            && operatorsStack.peek() != Operator.LEFT_PAREN
            && operatorsStack.peek().getPrecedence() >= currOperator.getPrecedence()
          ) {
            output.add(new Token(String.valueOf(operatorsStack.pop().value), TokenType.OPERATOR));
          }
          operatorsStack.push(currOperator);
        } else if (chars[i] == Operator.RIGHT_PAREN.value) {
          while (operatorsStack.peek() != Operator.LEFT_PAREN) {
            output.add(new Token(String.valueOf(operatorsStack.pop().value), TokenType.OPERATOR));
          }
          operatorsStack.pop(); // discard the left paren
        }
      }
    }

    if (tempNumber != null) {
      output.add(new Token(tempNumber, TokenType.NUMBER));
    }

    while (!operatorsStack.empty()) {
      output.add(new Token(String.valueOf(operatorsStack.pop().value), TokenType.OPERATOR));
    }

    final Stack<Double> processingStack = new Stack<>();
    for (Token token : output) {
      if (token.getType() == TokenType.NUMBER) {
        processingStack.push(Double.parseDouble(token.value));
      } else if (token.getType() == TokenType.OPERATOR) {
        final var second = processingStack.pop();
        final var first = processingStack.pop();
        final var operator = OPERATORS_MAP.get(token.value.charAt(0));
        if (operator == Operator.ADDITION) {
          processingStack.push(first + second);
        } else if (operator == Operator.SUBTRACTION) {
          processingStack.push(first - second);
        } else if (operator == Operator.MULTIPLICATION) {
          processingStack.push(first * second);
        } else if (operator == Operator.DIVISION) {
          processingStack.push(first / second);
        }
      }
    }

    return processingStack.pop();
  }

  enum Operator {
    ADDITION('+', 10),
    SUBTRACTION('-', 10),
    MULTIPLICATION('*', 20),
    DIVISION('/', 20),
    LEFT_PAREN('(', 0),
    RIGHT_PAREN(')', 0);

    private final char value;
    private final int precedence;

    Operator(final char value, final int precedence) {
      this.value = value;
      this.precedence = precedence;
    }

    public char getValue() {
      return this.value;
    }

    public int getPrecedence() {
      return this.precedence;
    }
  }

  enum TokenType {
    OPERATOR, NUMBER, LEFT_PAREN, RIGHT_PARENT
  }

  public static class Token {
    private final String value;
    private final TokenType type;

    public Token(final String value, final TokenType type) {
      this.value = value;
      this.type = type;
    }

    public String getValue() {
      return value;
    }

    public TokenType getType() {
      return type;
    }
  }

}

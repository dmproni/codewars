package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryScoOReTest {
  @Test
  void test() {
    assertEquals(BigInteger.ONE, BinaryScoORe.score(new BigInteger("55357665146075")));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CockroachSpeedTest {
  @Test
  public void basicTests() throws Exception {
    CockroachSpeed cockroach = new CockroachSpeed();
    assertEquals(30, cockroach.cockroachSpeed(1.08));
    assertEquals(30, cockroach.cockroachSpeed(1.09));
    assertEquals(0, cockroach.cockroachSpeed(0));
  }
}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.pdl.codewards.LarioAndMuigiPipeProblem.pipeFix;

class LarioAndMuigiPipeProblemTest {
  @Test
  public void tests() {
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
    assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, pipeFix(new int[]{1, 2, 3, 12}));
    assertArrayEquals(new int[]{6, 7, 8, 9}, pipeFix(new int[]{6, 9}));
    assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, pipeFix(new int[]{-1, 4}));
    assertArrayEquals(new int[]{1, 2, 3}, pipeFix(new int[]{1, 2, 3}));
  }
}
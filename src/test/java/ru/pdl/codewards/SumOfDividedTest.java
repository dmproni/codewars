package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.pdl.codewards.SumOfDivided.getPrimeNumbersUntilInclusively;

class SumOfDividedTest {

  @Test
  public void testOne() {
    assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(new int[]{12, 15}));
    assertEquals("(2 54)(3 135)(5 90)(7 21)", SumOfDivided.sumOfDivided(new int[]{15, 21, 24, 30, 45}));
    assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)",
      SumOfDivided.sumOfDivided(new int[]{107, 158, 204, 100, 118, 123, 126, 110, 116, 100}));
    assertEquals("(2 -61548)(3 -4209)(5 -28265)(23 -4209)(31 -31744)(53 -72769)(61 -4209)(1373 -72769)(5653 -28265)(7451 -29804)",
      SumOfDivided.sumOfDivided(new int[]{-29804, -4209, -28265, -72769, -31744}));
  }

  @Test
  void primeNumbers_empty() {
    assertEquals(0, getPrimeNumbersUntilInclusively(-5).length);
    assertEquals(0, getPrimeNumbersUntilInclusively(0).length);
    assertEquals(0, getPrimeNumbersUntilInclusively(1).length);
  }

  @Test
  void primeNumbers_success() {
    assertThat(getPrimeNumbersUntilInclusively(3), equalTo(new int[]{2, 3}));
    assertThat(getPrimeNumbersUntilInclusively(4), equalTo(new int[]{2, 3}));
    assertThat(getPrimeNumbersUntilInclusively(20), equalTo(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
    assertThat(getPrimeNumbersUntilInclusively(100),
      equalTo(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}));
  }

  @Test
  void getMaxAbsElement() {
    assertEquals(0, SumOfDivided.getMaxAbsElement(new int[]{}));
    assertEquals(100, SumOfDivided.getMaxAbsElement(new int[]{2, 3, 100}));
    assertEquals(100, SumOfDivided.getMaxAbsElement(new int[]{-100, -3, -9}));
  }

}
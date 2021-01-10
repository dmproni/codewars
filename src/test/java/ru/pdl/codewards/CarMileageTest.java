package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarMileageTest {

  @Test
  void testBadNumbers() {
    assertEquals(0, CarMileage.isInteresting(3, null));
    assertEquals(0, CarMileage.isInteresting(5, null));
    assertEquals(0, CarMileage.isInteresting(7, null));
    assertEquals(0, CarMileage.isInteresting(8, null));
    assertEquals(0, CarMileage.isInteresting(23, null));
    assertEquals(0, CarMileage.isInteresting(54, null));
    assertEquals(0, CarMileage.isInteresting(55, null));
    assertEquals(0, CarMileage.isInteresting(59, null));
    assertEquals(0, CarMileage.isInteresting(60, null));
    assertEquals(0, CarMileage.isInteresting(380, null));
    assertEquals(0, CarMileage.isInteresting(59200, null));
    assertEquals(0, CarMileage.isInteresting(352918, null));
    assertEquals(0, CarMileage.isInteresting(392918, null));
    assertEquals(0, CarMileage.isInteresting(901963, null));
    assertEquals(0, CarMileage.isInteresting(1000000000, null));
    assertEquals(0, CarMileage.isInteresting(Integer.MAX_VALUE, null));
    assertEquals(0, CarMileage.isInteresting(Integer.MIN_VALUE, null));
  }

  @Test
  void testProvidedArray() {
    assertEquals(1, CarMileage.isInteresting(901962, new int[]{901963}));
    assertEquals(1, CarMileage.isInteresting(592, new int[]{3902963, 594}));
    assertEquals(2, CarMileage.isInteresting(594, new int[]{594}));
    assertEquals(2, CarMileage.isInteresting(93903, new int[]{3920963, 93903, 9302963}));
  }

  @Test
  void testPalindromeDigits() {
    assertEquals(1, CarMileage.isInteresting(10499, null));
    assertEquals(1, CarMileage.isInteresting(371, null));
    assertEquals(2, CarMileage.isInteresting(32123, null));
    assertEquals(2, CarMileage.isInteresting(745547, null));
  }

  @Test
  void testDecrementingDigits() {
    assertEquals(1, CarMileage.isInteresting(541, null));
    assertEquals(1, CarMileage.isInteresting(653, null));
    assertEquals(1, CarMileage.isInteresting(986, null));
    assertEquals(2, CarMileage.isInteresting(8765, null));
    assertEquals(2, CarMileage.isInteresting(3210, null));
    assertEquals(2, CarMileage.isInteresting(210, null));
  }

  @Test
  void testIncrementingDigits() {
    assertEquals(1, CarMileage.isInteresting(1232, null));
    assertEquals(1, CarMileage.isInteresting(566, null));
    assertEquals(2, CarMileage.isInteresting(234, null));
    assertEquals(2, CarMileage.isInteresting(567, null));
    assertEquals(2, CarMileage.isInteresting(890, null));
  }

  @Test
  void testDigitWithNextZeroes() {
    assertEquals(1, CarMileage.isInteresting(98, null));
    assertEquals(1, CarMileage.isInteresting(99, null));
    assertEquals(1, CarMileage.isInteresting(599, null));
    assertEquals(1, CarMileage.isInteresting(798, null));
    assertEquals(2, CarMileage.isInteresting(100, null));
    assertEquals(2, CarMileage.isInteresting(600, null));
    assertEquals(2, CarMileage.isInteresting(9000, null));
  }

  @Test
  void testAllDigitsAreTheSame() {
    assertEquals(1, CarMileage.isInteresting(775, null));
    assertEquals(1, CarMileage.isInteresting(997, null));
    assertEquals(2, CarMileage.isInteresting(9999, null));
    assertEquals(2, CarMileage.isInteresting(555, null));
  }

  @Test
  void testTooSmall() {
    assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
  }

  @Test
  void testAlmostAwesome() {
    assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
  }

  @Test
  void testAwesome() {
    assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
  }

  @Test
  void testFarNotInteresting() {
    assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
  }

  @Test
  void testAlmostInteresting() {
    assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
  }

  @Test
  void testInteresting() {
    assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
  }

}
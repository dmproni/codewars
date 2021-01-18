package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.pdl.codewards.BinaryFormat.toBinary;

class BinaryFormatTest {

  @Test
  public void testToBinary() {
    assertEquals(1, toBinary(1));
    assertEquals(10, toBinary(2));
    assertEquals(11, toBinary(3));
    assertEquals(101, toBinary(5));
  }

}
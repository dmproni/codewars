package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListToAStringConverterTest {
  @Test
  public void sampleTests() {
    assertEquals("1 -> 2 -> 3 -> null", LinkedListToAStringConverter.stringify(new LinkedListToAStringConverterNode(1, new LinkedListToAStringConverterNode(2, new LinkedListToAStringConverterNode(3)))));
    assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", LinkedListToAStringConverter.stringify(new LinkedListToAStringConverterNode(0, new LinkedListToAStringConverterNode(1, new LinkedListToAStringConverterNode(4, new LinkedListToAStringConverterNode(9, new LinkedListToAStringConverterNode(16)))))));
    assertEquals("null", LinkedListToAStringConverter.stringify(null));
  }
}
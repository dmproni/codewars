package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ParsingPricesRegexpBasicsTest {
  @Test
  void testBasic() {
    assertNull(ParsingPricesRegexpBasics.toCents(""));
    assertNull(ParsingPricesRegexpBasics.toCents("1"));
    assertNull(ParsingPricesRegexpBasics.toCents("1.23"));
    assertNull(ParsingPricesRegexpBasics.toCents("$1"));
    assertEquals(Integer.valueOf(123), ParsingPricesRegexpBasics.toCents("$1.23"));
    assertEquals(Integer.valueOf(9999), ParsingPricesRegexpBasics.toCents("$99.99"));
    assertEquals(Integer.valueOf(1234567890), ParsingPricesRegexpBasics.toCents("$12345678.90"));
    assertEquals(Integer.valueOf(969), ParsingPricesRegexpBasics.toCents("$9.69"));
    assertEquals(Integer.valueOf(970), ParsingPricesRegexpBasics.toCents("$9.70"));
    assertEquals(Integer.valueOf(971), ParsingPricesRegexpBasics.toCents("$9.71"));
    assertNull(ParsingPricesRegexpBasics.toCents("$1.23\n"));
    assertNull(ParsingPricesRegexpBasics.toCents("\n$1.23"));
    assertEquals(Integer.valueOf(69), ParsingPricesRegexpBasics.toCents("$0.69"));
    assertNull(ParsingPricesRegexpBasics.toCents("$9.69$4.3.7"));
    assertNull(ParsingPricesRegexpBasics.toCents("$9.692"));
  }
}
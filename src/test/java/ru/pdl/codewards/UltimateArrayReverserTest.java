package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UltimateArrayReverserTest {

  @Test
  public void FixedTest1()
  {
    assertEquals(new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"},
      UltimateArrayReverser.reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
  }
  @Test public void FixedTest2()
  {
    assertEquals(new String[]
        {"How", "many", "shrimp", "do", "you", "have", "to", "eat",
          "before", "your", "skin", "starts", "to", "turn", "pink?"},
      UltimateArrayReverser.reverse(new String[]{"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"}));
  }

}
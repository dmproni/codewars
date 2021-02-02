package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeadIsAtTheWrongEndTest {

  private static void test(final String[] expected, final String[] actual) {
    assertArrayEquals(expected, HeadIsAtTheWrongEnd.fixTheMeerkat(actual));
  }

  @Test
  public void exampleTest1() {
    test(new String[]{"head", "body", "tail"}, new String[]{"tail", "body", "head"});
  }

  @Test
  public void exampleTest2() {
    test(new String[]{"heads", "body", "tails"}, new String[]{"tails", "body", "heads"});
  }


  @Test
  public void exampleTest3() {
    test(new String[]{"top", "middle", "bottom"}, new String[]{"bottom", "middle", "top"});
  }

  @Test
  public void exampleTest4() {
    test(new String[]{"upper legs", "torso", "lower legs"}, new String[]{"lower legs", "torso", "upper legs"});
  }

  @Test
  public void exampleTest5() {
    test(new String[]{"sky", "rainbow", "ground"}, new String[]{"ground", "rainbow", "sky"});
  }

  @Test
  public void exampleTest6() {
    test(new String[]{"Falco", "Falco", "Souther"}, new String[]{"Souther", "Falco", "Falco"});
    test(new String[]{"Falco", "Falco", "Souther"}, new String[]{"Falco, Han, Souther"});
  }
}
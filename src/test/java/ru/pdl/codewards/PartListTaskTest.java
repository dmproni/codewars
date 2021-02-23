package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PartListTaskTest {
  private static void test(String expected, final String... input) {
    assertEquals(expected, Arrays.deepToString(PartListTask.partlist(input)));
  }

  @Test
  public void test1() {
    test("[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]",
      "cdIw", "tzIy", "xDu", "rThG");
  }

  @Test
  public void test2() {
    test("[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]",
      "I", "wish", "I", "hadn't", "come");
  }

  @Test
  public void test3() {
    test("[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]",
      "vJQ", "anj", "mQDq", "sOZ");
  }
}
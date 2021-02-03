package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheSpeedOfLettersTest {
  @Test
  public void test01() {
    Assertions.assertEquals("A                         Z", TheSpeedOfLetters.speedify("AZ"));
  }

  @Test
  public void test02() {
    Assertions.assertEquals("A B C", TheSpeedOfLetters.speedify("ABC"));
  }

  @Test
  public void test03() {
    Assertions.assertEquals("A  C  E", TheSpeedOfLetters.speedify("ACE"));
    /*Tester.doTest("CBA", "  A");
    Tester.doTest("HELLOWORLD", "     E H    DLL   OLO   R  W");*/
  }

  @Test
  public void test04() {
    Assertions.assertEquals("  A", TheSpeedOfLetters.speedify("CBA"));
  }

  @Test
  public void test05() {
    Assertions.assertEquals("     E H    DLL   OLO   R  W", TheSpeedOfLetters.speedify("HELLOWORLD"));
  }
}
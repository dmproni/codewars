package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyBirthdayDarlingTest {
  @Test
  public void test01() {
    assertEquals("32? That's just 20, in base 16!", HappyBirthdayDarling.womensAge(32));
  }

  @Test
  public void test02() {
    assertEquals("39? That's just 21, in base 19!", HappyBirthdayDarling.womensAge(39));
  }

  @Test
  public void test03() {
    assertEquals("22? That's just 20, in base 11!", HappyBirthdayDarling.womensAge(22));
  }

  @Test
  public void test04() {
    assertEquals("65? That's just 21, in base 32!", HappyBirthdayDarling.womensAge(65));
  }

  @Test
  public void test05() {
    assertEquals("83? That's just 21, in base 41!", HappyBirthdayDarling.womensAge(83));
  }
}
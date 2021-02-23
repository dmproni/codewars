package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCreationTest {
  @Test
  public void test01() {
    assertEquals(true, PalindromeCreation.solve("abba"));
  }

  @Test
  public void test02() {
    assertEquals(false, PalindromeCreation.solve("abaazaba"));
  }

  @Test
  public void test03() {
    assertEquals(true, PalindromeCreation.solve("abccba"));
  }

  @Test
  public void test04() {
    assertEquals(true, PalindromeCreation.solve("adfa"));
  }

  @Test
  public void test05() {
    assertEquals(false, PalindromeCreation.solve("ae"));
  }

  @Test
  public void test06() {
    assertEquals(true, PalindromeCreation.solve("sq"));
  }

  @Test
  public void test07() {
    assertEquals(false, PalindromeCreation.solve("abzy"));
  }

  @Test
  public void test08() {
    assertEquals(true, PalindromeCreation.solve("kxbkwgyydkcbtjcosgikfdyhuuprubpwthgflucpyylbofvqxkkvqthmdnywpaunfihvupbwpruwfybdmgeuocltdaidyyewmbzm"));
  }

  @Test
  public void test09() {
    assertEquals(false, PalindromeCreation.solve("ab"));
  }
}
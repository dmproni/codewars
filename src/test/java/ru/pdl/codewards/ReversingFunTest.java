package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversingFunTest {

  @Test
  public void test1() {
    assertEquals("201", ReversingFun.funReverse("012"));
  }

  @Test
  public void test2() {
    assertEquals("504132", ReversingFun.funReverse("012345"));
  }

  @Test
  public void test3() {
    assertEquals("9081726354", ReversingFun.funReverse("0123456789"));
  }

  @Test
  public void test4() {
    assertEquals("oHlel", ReversingFun.funReverse("Hello"));
  }

  @Test
  public void test5() {
    assertEquals("84rptpzsno51dvmdkjbc59fryj", ReversingFun.funReverse("4ppso1vdjc9rjyf5bkmd5nztr8"));
  }

}
package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TvRemoteTaskTest {

  @Test
  public void example() {
    assertEquals(36, TvRemoteTask.tvRemote("codewars"));
  }

  @Test
  public void test01() {
    assertEquals(16, TvRemoteTask.tvRemote("does"));
  }

  @Test
  public void test02() {
    assertEquals(23, TvRemoteTask.tvRemote("your"));
  }

  @Test
  public void test03() {
    assertEquals(33, TvRemoteTask.tvRemote("solution"));
  }

  @Test
  public void test04() {
    assertEquals(20, TvRemoteTask.tvRemote("work"));
  }

  @Test
  public void test05() {
    assertEquals(12, TvRemoteTask.tvRemote("for"));
  }

  @Test
  public void test06() {
    assertEquals(27, TvRemoteTask.tvRemote("these"));
  }

  @Test
  public void test07() {
    assertEquals(25, TvRemoteTask.tvRemote("words"));
  }
}
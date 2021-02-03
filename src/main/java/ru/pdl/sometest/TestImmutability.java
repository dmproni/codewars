package ru.pdl.sometest;

public class TestImmutability {
  private final int age;

  public TestImmutability(final int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

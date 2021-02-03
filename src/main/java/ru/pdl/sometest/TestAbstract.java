package ru.pdl.sometest;

public abstract class TestAbstract {
  private final int age;
  private final String name;

  public TestAbstract() {
    this.age = age();
    this.name = name();
  }

  protected abstract int age();

  protected abstract String name();

  public void test() {
    System.out.println(String.format("%s - %d", this.name, this.age));
  }
}

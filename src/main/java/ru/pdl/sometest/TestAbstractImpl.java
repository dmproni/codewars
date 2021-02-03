package ru.pdl.sometest;

public class TestAbstractImpl extends TestAbstract {
  private final int cached;

  public TestAbstractImpl(final int cached) {
    this.cached = cached;
  }

  @Override
  protected int age() {
    return cached;
  }

  @Override
  protected String name() {
    return "good";
  }

  public static void main(String[] args) {
    var t = new TestAbstractImpl(50);
    t.test();
  }
}

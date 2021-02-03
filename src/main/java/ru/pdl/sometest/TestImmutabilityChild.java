package ru.pdl.sometest;

public class TestImmutabilityChild extends TestImmutability {
  private int myAge;

  public TestImmutabilityChild(final int age) {
    super(age);
    this.myAge = age;
  }

  @Override
  public int getAge() {
    return myAge;
  }

  public void setMyAge(int myAge) {
    this.myAge = myAge;
  }
}

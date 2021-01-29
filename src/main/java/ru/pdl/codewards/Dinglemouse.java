package ru.pdl.codewards;

public class Dinglemouse {
  private static int ONE_HUNDRED = 100;
  public static final Dinglemouse INST = new Dinglemouse();

  private final int value;

  private Dinglemouse() {
    value = ONE_HUNDRED;
  }

  public static void main(String[] args) {
    System.out.println(Dinglemouse.INST.plus100(23));
    System.out.println(Dinglemouse.INST.plus100(23));
  }

  public int plus100(int n) {
    return value + n;
  }
}

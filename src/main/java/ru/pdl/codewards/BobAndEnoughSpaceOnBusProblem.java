package ru.pdl.codewards;

public class BobAndEnoughSpaceOnBusProblem {

  public static int enough(int cap, int on, int wait) {
    return Math.max(wait - (cap - on), 0);
  }

}

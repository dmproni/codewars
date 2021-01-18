package ru.pdl.codewards;

public class BinaryFormat {

  public static int toBinary(int n) {
    return Integer.parseInt(Integer.toBinaryString(n));
  }

  public static void main(String[] args) {
    System.out.println(Integer.toBinaryString(18));
  }

}

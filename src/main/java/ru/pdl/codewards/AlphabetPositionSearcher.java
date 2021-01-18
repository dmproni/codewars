package ru.pdl.codewards;

public class AlphabetPositionSearcher {

  public static String position(char alphabet) {
    return String.format("Position of alphabet: %d", alphabet - 96);
  }

  public static void main(String[] args) {
    System.out.println(('a' - 96));
    System.out.println(Character.valueOf('a').charValue());
  }

}

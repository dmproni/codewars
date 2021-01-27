package ru.pdl.codewards;

public class AgeFormatter {

  public static String describeAge(int age) {
    return "You're a(n) " + (age > 64 ? "elderly" : age >= 18 ? "adult" : age > 12 ? "teenager" : "kid");
  }

}

package ru.pdl;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 */
public class SimplePigLatin {
  public static String pigIt(String str) {
    return str != null ? str.replaceAll("(\\w{1})(\\w*)", "$2$1ay") : null;
  }
}

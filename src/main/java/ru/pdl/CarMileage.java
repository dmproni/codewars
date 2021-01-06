package ru.pdl;

public class CarMileage {
  public final static int LEAST_INTERESTING_NUMBER = 100;
  public final static int MAX_INPUT_NUMBER = 1_000_000_000 - 1;
  public final static int NUM_OF_MILES_TO_ALERT = 2;

  public static int isInteresting(int number, int[] awesomePhrases) {
    if (number < LEAST_INTERESTING_NUMBER - NUM_OF_MILES_TO_ALERT || number > MAX_INPUT_NUMBER) {
      return 0;
    }

    for (int i = 0; i < 3; i++) {
      final int testingNumber = number + i;
      if (testingNumber < LEAST_INTERESTING_NUMBER) {
        continue;
      }
      final String strNum = Integer.valueOf(testingNumber).toString();
      if (isDigitWithZero(strNum)
        || hasTheSameDigits(strNum)
        || isIncrementing(testingNumber)
        || isDecrementing(testingNumber)
        || isPalindrome(strNum)
        || isInProvidedArray(testingNumber, awesomePhrases)
      ) {
        return i == 0 ? 2 : 1;
      }
    }

    return 0;
  }

  private static boolean isInProvidedArray(final int num, final int[] array) {
    if (array != null && array.length > 0) {
      for (int i : array) {
        if (i == num) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean isPalindrome(final String strNum) {
    return new StringBuilder(strNum).reverse().toString().equals(strNum);
  }

  private static boolean isDigitWithZero(final String strNum) {
    return strNum.matches("[123456789]{1}[0]+");
  }

  private static boolean hasTheSameDigits(final String strNum) {
    return strNum.matches("([123456789])\\1+");
  }

  private static boolean isDecrementing(final int num) {
    int prevLastDigit = num % 10;
    int copy = num / 10;

    while (copy > 0) {
      int lastDigit = copy % 10;
      if (!(lastDigit == prevLastDigit + 1)) {
        return false;
      }
      prevLastDigit = lastDigit;
      copy = copy / 10;
    }
    return true;
  }

  private static boolean isIncrementing(final int num) {
    int prevLastDigit = num % 10;
    int copy = num / 10;

    while (copy > 0) {
      int lastDigit = copy % 10;
      if (!(lastDigit == prevLastDigit - 1 || (lastDigit == 9 && prevLastDigit == 0))) {
        return false;
      }
      prevLastDigit = lastDigit;
      copy = copy / 10;
    }
    return true;
  }

}

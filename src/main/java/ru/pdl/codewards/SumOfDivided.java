package ru.pdl.codewards;

import java.util.Set;
import java.util.TreeSet;

public class SumOfDivided {
  public static String sumOfDivided(int[] arr) {
    final var primeFactors = getPrimeFactors(arr);

    final var result = new StringBuilder();

    for (Integer primeFactor : primeFactors) {
      var sum = 0;
      for (var i : arr) {
        if (Math.abs(i) >= primeFactor && i % primeFactor == 0) {
          sum += i;
        }
      }
      append(result, primeFactor, sum);
    }

    return result.toString();
  }

  private static Set<Integer> getPrimeFactors(final int[] arr) {
    final var result = new TreeSet<Integer>();
    final var primes = getPrimeNumbersUntilInclusively(getMaxAbsElement(arr));
    for (var prime : primes) {
      for (int i : arr) {
        if (i % prime == 0) {
          result.add(prime);
          continue;
        }
      }
    }
    return result;
  }

  private static void append(final StringBuilder result, final int prime, final int sum) {
    result.append('(');
    result.append(prime);
    result.append(' ');
    result.append(sum);
    result.append(')');
  }

  public static int getMaxAbsElement(final int[] arr) {
    int currentMax = 0;
    for (int i : arr) {
      final var absI = Math.abs(i);
      if (absI > currentMax) {
        currentMax = absI;
      }
    }
    return currentMax;
  }

  public static int[] getPrimeNumbersUntilInclusively(final int n) {
    if (n < 2) {
      return new int[]{};
    }

    final boolean notPrime[] = new boolean[n + 1];
    int countPrimes = 0;
    for (int i = 2; i <= n; i++) {
      if (!notPrime[i]) {
        countPrimes++;
        for (int j = i * 2; j <= n; j += i) {
          notPrime[j] = true;
        }
      }
    }

    final int[] result = new int[countPrimes];
    int index = 0;
    for (int i = 2; i <= n; i++) {
      if (!notPrime[i]) {
        result[index++] = i;
      }
    }

    return result;
  }
}

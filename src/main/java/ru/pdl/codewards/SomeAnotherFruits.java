package ru.pdl.codewards;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SomeAnotherFruits {

  private static final Map<Integer, String> FRUITS = Map.of(
    1, "kiwi", 2, "pear", 3, "kiwi", 4, "banana", 5, "melon",
    6, "banana", 7, "melon", 8, "pineapple", 9, "apple");

  public static String subtractSum(int n) {
    if (n >= 1 && n <= 9) return FRUITS.get(n);
    return subtractSum(n - sumDigits(n));
  }

  private static int sumDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(subtractSum(10));
    String s = "9";
    Character.isDigit(s.charAt(0));
    String rrr = "skjdf02k";
    var res = rrr.chars().mapToObj(v -> String.valueOf(v)).collect(Collectors.joining("***"));
    System.out.println(res);
    String[] arr = new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
    var first = Arrays.stream(arr).sorted().findFirst().orElseThrow();
    System.out.println("res: " + first);
  }

}

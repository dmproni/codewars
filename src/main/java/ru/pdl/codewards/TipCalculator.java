package ru.pdl.codewards;

import java.util.Map;

public class TipCalculator {
  private static final Map<String, Integer> RATINGS = Map.of("excellent", 20, "great", 15, "good", 10, "poor", 5, "terrible", 0);

  public static Integer calculateTip(double amount, String rating) {
    var service = rating.toLowerCase();
    if (RATINGS.containsKey(service)) {
      return (int) Math.ceil(RATINGS.get(service) / 100.0 * amount);
    } else {
      return null;
    }
  }
}

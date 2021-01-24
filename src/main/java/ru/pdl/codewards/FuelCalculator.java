package ru.pdl.codewards;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FuelCalculator {
  public static double fuelPrice(int litres, double pricePerLitre) {
    final double discount = litres >= 10 ? 25 : litres >= 8 ? 20 : litres >= 6 ? 15 : litres >= 4 ? 10 : litres >= 2 ? 5 : 0;
    return litres * (pricePerLitre - discount / 100);
  }

  public static void main(String[] args) {
    System.out.println(TwoDecimalPlaces(4.6593902));
  }

  public static String printArray(Object[] array) {
    return Arrays.stream(array).map(v -> v.toString()).collect(Collectors.joining());
  }

  public static double TwoDecimalPlaces(double number) {
    return Math.round(number * 100) / 100.0;
  }
}

package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FuelCalculator {
  public static double fuelPrice(int litres, double pricePerLitre) {
    final double discount = litres >= 10 ? 25 : litres >= 8 ? 20 : litres >= 6 ? 15 : litres >= 4 ? 10 : litres >= 2 ? 5 : 0;
    return litres * (pricePerLitre - discount / 100);
  }

  public static void main(String[] args) {
    var list = new ArrayList<Integer>();
    list.stream().filter(v -> v % 2 == 1).collect(Collectors.toList());
  }

  private static int toInt(Object v) {
    return v instanceof Integer ? (int) v : Integer.parseInt((String) v);
  }

  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(v -> v instanceof Integer ? (int) v : Integer.parseInt((String) v)).sum();
  }

  public static String printArray(Object[] array) {
    return Arrays.stream(array).map(v -> v.toString()).collect(Collectors.joining());
  }

  public static double TwoDecimalPlaces(double number) {
    return Math.round(number * 100) / 100.0;
  }
}

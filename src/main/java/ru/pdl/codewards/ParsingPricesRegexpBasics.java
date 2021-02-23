package ru.pdl.codewards;

import java.util.ArrayList;
import java.util.List;

public class ParsingPricesRegexpBasics {
  public static Integer toCents(String price) {
    return price.matches("\\$\\d+(\\.){1}\\d{2}")
      ? Integer.parseInt(price.replace("$", "").replace(".", ""))
      : null;
  }
}

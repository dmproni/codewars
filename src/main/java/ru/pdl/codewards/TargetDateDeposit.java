package ru.pdl.codewards;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TargetDateDeposit {
  private static final LocalDate START_DATE = LocalDate.of(2016, Month.JANUARY, 1);
  private static final int DAYS_IN_YEAR = 360;

  public static String dateNbDays(double a0, double a, double p) {

    final double yearRate = p / 100;
    int totalNumOfDays = 0;
    double currDeposit = a0;

    while (true) {
      final double temp = currDeposit * yearRate;
      if (currDeposit + temp > a) {
        break;
      }
      currDeposit += temp;
      totalNumOfDays += DAYS_IN_YEAR;
    }

    final var restSum = a - currDeposit;
    final var sumPerDay = currDeposit * yearRate / 360;
    final var restOfDays = (long) (restSum / sumPerDay);

    System.out.println(String.format("rest of days=%d; rest sum=%f, sum per day=%f", restOfDays, restSum, sumPerDay));


    var result = START_DATE.plusDays(totalNumOfDays + restOfDays - 1);
    return result.format(DateTimeFormatter.ISO_DATE);
  }
}

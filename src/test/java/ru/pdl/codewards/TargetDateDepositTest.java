package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetDateDepositTest {
  private static void testing(String actual, String expected) {
    assertEquals(expected, actual);
  }

  @Test
  public void test() {
    System.out.println("Fixed Tests dateNbDays");
//    testing(TargetDateDeposit.dateNbDays(100.98, 101, 0.98), "2017-01-01");
    testing(TargetDateDeposit.dateNbDays(100, 101, 0.98), "2017-01-01");
    testing(TargetDateDeposit.dateNbDays(100, 150, 2.00), "2035-12-26");
    testing(TargetDateDeposit.dateNbDays(4281, 5087, 2), "2024-07-03");
    testing(TargetDateDeposit.dateNbDays(4620, 5188, 2), "2021-09-19");
    testing(TargetDateDeposit.dateNbDays(9999, 11427, 6), "2018-03-13");
    testing(TargetDateDeposit.dateNbDays(3525, 4822, 3), "2026-04-18");
    testing(TargetDateDeposit.dateNbDays(5923, 6465, 6), "2017-06-10");
    testing(TargetDateDeposit.dateNbDays(4254, 4761, 8), "2017-05-22");
    testing(TargetDateDeposit.dateNbDays(1244, 2566, 4), "2033-11-04");
    testing(TargetDateDeposit.dateNbDays(6328, 7517, 5), "2019-05-25");
    testing(TargetDateDeposit.dateNbDays(2920, 3834, 2), "2029-06-03");
    testing(TargetDateDeposit.dateNbDays(7792, 8987, 4), "2019-07-09");
  }
}
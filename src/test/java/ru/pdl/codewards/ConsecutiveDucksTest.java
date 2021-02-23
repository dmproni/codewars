package ru.pdl.codewards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveDucksTest {
  private static void test(final int i, final boolean result) {
    Assertions.assertEquals(result, ConsecutiveDucks.consecutiveDucks(i));
  }

  @Test
  public void checkSmallValues() {
    test(69, true);
    test(8, false);
    test(57, true);
    test(6, true);
    test(13, true);
    test(16, false);
    test(91, true);
  }

  @Test
  public void checkMediumValues() {
    test(522, true);
    test(974, true);
    test(755, true);
    test(512, false);
    test(739, true);
    test(1006, true);
    test(838, true);
  }

  @Test
  public void checkLargeValues() {
    test(382131, true);
    test(118070, true);
    test(17209, true);
    test(32768, false);
    test(161997, true);
    test(400779, true);
    test(198331, true);
  }

  @Test
  public void checkRandom() {
    test(383945772, true);
    test(149115749, true);
    test(1415552854, true);
    test(862913364, true);
    test(1877987017, true);
    test(1820470151, true);
    test(1592306348, true);
    test(989553269, true);
    test(1881780926, true);
    test(399435898, true);
    test(839014308, true);
    test(1090957297, true);
    test(1671604660, true);
    test(967851292, true);
    test(1361982833, true);
    test(1654111033, true);
    test(1250493381, true);
    test(2033439390, true);
    test(1629728286, true);
  }
}
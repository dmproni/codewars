package ru.pdl.codewards;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

public class BinaryScoORe {

  public static BigInteger score(BigInteger n) {
    if (n == null || n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) return n;

    int p = 1;
    while (new BigInteger(String.valueOf((long) Math.pow(2, p))).compareTo(n) < 1) {
      p++;
    }

    return new BigInteger(String.valueOf((long) (Math.pow(2, p - 1) - 1)));
  }

  public static BigInteger score(long n) {
    return score(new BigInteger(String.valueOf(n)));
  }

  public static void main(String[] args) throws MalformedURLException {
    final var r = "slkdf";

//    System.out.println(score(60340));
//    System.out.println(score(19046));
//    System.out.println(score(44806));
//    System.out.println(score(68199));
//    System.out.println(score(1684));
//    System.out.println(score(39402));
//    System.out.println(score(56525));
//    System.out.println(score(87391));
//    System.out.println(score(30562));
//    System.out.println(score(54247));
//    System.out.println(score(51169));
//    System.out.println(score(79605));
//    System.out.println(score(55536));
//    System.out.println(score(54191));
//    System.out.println(score(3235));
//    System.out.println(score(13995));
//    System.out.println(score(67025));
//    System.out.println(score(25462));
//    System.out.println(score(82795));
//    System.out.println(score(80083));
//    System.out.println(score(46485));
//    System.out.println(score(79048));
//    System.out.println(score(44764));
//    System.out.println(score(9455));
//    System.out.println(score(60826));
//    System.out.println(score(74007));
//    System.out.println(score(5408));
//    System.out.println(score(82551));
//    System.out.println(score(79661));
//    System.out.println(score(45225));
//    System.out.println(score(82051));
//    System.out.println(score(12998));
//    System.out.println(score(20372));
//    System.out.println(score(87246));
//    System.out.println(score(63624));
//    System.out.println(score(70139));
//    System.out.println(score(59580));
//    System.out.println(score(60139));
//    System.out.println(score(28443));
//    System.out.println(score(12841));
//    System.out.println(score(49305));
//    System.out.println(score(99552));
//    System.out.println(score(20951));
//    System.out.println(score(75979));
//    System.out.println(score(20091));
//    System.out.println(score(5529));
//    System.out.println(score(27352));
//    System.out.println(score(33958));
//    System.out.println(score(7738));
//    System.out.println(score(8675));
//    System.out.println(score(10158));
//    System.out.println(score(28201));
//    System.out.println(score(6534));
//    System.out.println(score(19156));
//    System.out.println(score(61028));
//    System.out.println(score(12996));
//    System.out.println(score(24034));
//    System.out.println(score(77415));
//    System.out.println(score(77312));
//    System.out.println(score(66809));
//    System.out.println(score(62424));
//    System.out.println(score(38804));
//    System.out.println(score(34539));
//    System.out.println(score(96382));
//    System.out.println(score(20406));
//    System.out.println(score(28238));
//    System.out.println(score(29488));
//    System.out.println(score(205));
//    System.out.println(score(11359));
//    System.out.println(score(41293));
//    System.out.println(score(24274));
//    System.out.println(score(97133));
//    System.out.println(score(69960));
//    System.out.println(score(72487));
//    System.out.println(score(30783));
//    System.out.println(score(71549));
//    System.out.println(score(18443));
//    System.out.println(score(82179));
//    System.out.println(score(33604));
//    System.out.println(score(62875));
//    System.out.println(score(33005));
//    System.out.println(score(54500));
//    System.out.println(score(66083));
//    System.out.println(score(14588));
//    System.out.println(score(50843));
//    System.out.println(score(98207));
//    System.out.println(score(85807));
//    System.out.println(score(8742));
//    System.out.println(score(21398));
//    System.out.println(score(2541));
//    System.out.println(score(29028));
//    System.out.println(score(73043));
//    System.out.println(score(95320));
//    System.out.println(score(30586));
//    System.out.println(score(79861));
//    System.out.println(score(17059));
//    System.out.println(score(44472));
//    System.out.println(score(34392));
//    System.out.println(score(56632));
//    System.out.println(score(24106));
//    System.out.println(score(32941296));
//    System.out.println(score(16885269));
//    System.out.println(score(50271805));
//    System.out.println(score(33249933));
//    System.out.println(score(30577573));
//    System.out.println(score(24125157));
//    System.out.println(score(17243870));
//    System.out.println(score(3663076));
//    System.out.println(score(7889900));
//    System.out.println(score(45967212));
//    System.out.println(score(33897684));
//    System.out.println(score(28083546));
  }
}

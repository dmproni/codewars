package ru.pdl.codewards;

public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    final var canPullBlue = blueStart - bluePulled;
    final var numOfOutcomes = canPullBlue + (redStart - redPulled);
    return canPullBlue / (double) numOfOutcomes;
  }
}

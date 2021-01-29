package ru.pdl.codewards;

public class FindTheSlope {
  public String slope(int[] points) {
    var yDifference = points[2] - points[0];
    return yDifference == 0 ? "undefined" : String.valueOf((points[3] - points[1]) / yDifference);
  }
}

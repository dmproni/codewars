package ru.pdl.codewards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestKnightPathTest {

  @Test
  void testGettingPossiblePositions() {
    assertThat(ShortestKnightPath.getPossiblePositions("a1"), containsInAnyOrder(new String[]{"c2", "b3"}));
    assertThat(ShortestKnightPath.getPossiblePositions("b2"), containsInAnyOrder(new String[]{"d1", "d3", "c4", "a4"}));
    assertThat(ShortestKnightPath.getPossiblePositions("d5"), containsInAnyOrder(new String[]{"c3", "e3", "f4", "f6", "c7", "e7", "b4", "b6"}));
    assertThat(ShortestKnightPath.getPossiblePositions("g6"), containsInAnyOrder(new String[]{"f4", "h4", "e5", "e7", "f8", "h8"}));
  }

  @Test
  void testGettingAllPossiblePositions() {
    "abcdefgh".chars().forEach(x ->
      IntStream.range(1, 9).forEach(y ->
        assertThat(ShortestKnightPath.getPossiblePositions(String.format("%s%d", x, y)), notNullValue())
      )
    );
  }

  @ParameterizedTest
  @CsvSource({"a1, a1, 0", "a1, c1, 2", "a1, f1, 3", "a1, f3, 3", "a1, f4, 4", "a1, f7, 5"})
  public void test_a1_c1(String start, String finish, Integer expectedNumOfTurns) {
    assertEquals(expectedNumOfTurns, ShortestKnightPath.knight(start, finish));
  }

}
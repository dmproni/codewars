package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckDuckGooseTest {

  @Test
  public void tests() {
    DuckDuckGoose.Player[] players = makePlayerArr(new String[]{"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
    assertEquals("a", DuckDuckGoose.duckDuckGoose(players, 1));
    assertEquals("c", DuckDuckGoose.duckDuckGoose(players, 3));
    assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 10));
    assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 20));
    assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 30));
    assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 18));
    assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 28));
    assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 12));
    assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 2));
    assertEquals("f", DuckDuckGoose.duckDuckGoose(players, 7));
  }

  private DuckDuckGoose.Player[] makePlayerArr(String[] names) {
    DuckDuckGoose.Player[] players = new DuckDuckGoose.Player[names.length];
    for (int i = 0; i < names.length; i++) {
      players[i] = new DuckDuckGoose.Player(names[i]);
    }
    return players;
  }

}
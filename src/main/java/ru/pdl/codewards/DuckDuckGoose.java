package ru.pdl.codewards;

public class DuckDuckGoose {

  public static String duckDuckGoose(Player[] players, int goose) {
    final var index = players.length >= goose ? goose : goose - players.length * (goose / players.length);
    return players[(index == 0 ? players.length : index) - 1].name;
  }

  public static class Player {
    public String name;

    public Player(final String name) {
      this.name = name;
    }
  }

}

package ru.pdl.codewards;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokerHand {
  private final int score;
  private HandType type;

  PokerHand(String hand) {
    final List<Card> cards = Arrays.stream(hand.split(" "))
      .map(Card::new)
      .collect(Collectors.toList());

    final boolean allCardsHaveTheSameSuit = cards.stream().map(Card::getSuit).distinct().count() == 1;
    this.score = (allCardsHaveTheSameSuit ? calcFlushes(cards) : calcOrdinary(cards)) + type.getScore();
  }

  private int calcFlushes(final List<Card> cards) {
    return calcRoyalFlush(cards);
  }

  private int calcOrdinary(final List<Card> cards) {
    return calcFourOfAKind(cards);
  }

  private int calcRoyalFlush(final List<Card> cards) {
    final var values = cards.stream().map(Card::getValue).collect(Collectors.toList());
    if (values.contains(10) && values.contains(11) && values.contains(12) && values.contains(13) && values.contains(14)) {
      this.type = HandType.ROYAL_FLUSH;
      return 0;
    } else {
      return calcStraightFlush(cards);
    }
  }

  public int calcStraightFlush(final List<Card> cards) {
    final List<Integer> values = cards.stream().map(Card::getValue).sorted().collect(Collectors.toList());
    for (int i = 1; i < values.size(); i++) {
      if (values.get(i - 1) + 1 != values.get(i)) {
        return calcFlush(cards);
      }
    }
    this.type = HandType.STRAIGHT_FLUSH;
    return values.get(0);
  }

  public int calcFourOfAKind(final List<Card> cards) {
    final var map = cards.stream()
      .map(Card::getValue)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    if (map.containsValue(4L)) {
      int baseCardScore = 0;
      int addCardScore = 0;
      for (Map.Entry<Integer, Long> entry : map.entrySet()) {
        if (entry.getValue() == 4L) {
          baseCardScore = entry.getKey();
        } else {
          addCardScore = entry.getKey();
        }
      }
      this.type = HandType.FOUR_OF_A_KIND;
      return baseCardScore * 10 + addCardScore;
    }
    return calcFullHouse(cards);
  }

  public int calcFullHouse(final List<Card> cards) {
    final var map = cards.stream()
      .map(Card::getValue)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    if (map.containsValue(3L) && map.containsValue(2L)) {
      int threeCardsValue = 0;
      int twoCardsValue = 0;
      for (Map.Entry<Integer, Long> entry : map.entrySet()) {
        if (entry.getValue() == 3L) {
          threeCardsValue = entry.getKey();
        } else {
          twoCardsValue = entry.getKey();
        }
      }
      this.type = HandType.FULL_HOUSE;
      return threeCardsValue * 10 + twoCardsValue;
    }
    return calcStraight(cards);
  }

  public int calcFlush(final List<Card> cards) {
    int tempScore = 0;
    int exponent = 1;
    final var sortedCards = cards.stream().map(Card::getValue).sorted().collect(Collectors.toList());
    for (Integer value : sortedCards) {
      tempScore += value * Math.pow(10, exponent);
      exponent++;
    }
    this.type = HandType.FLUSH;
    return tempScore;
  }

  public int calcStraight(final List<Card> cards) {
    boolean isStraight = true;
    final List<Integer> sortedValues = cards.stream().map(Card::getValue).sorted().collect(Collectors.toList());
    for (int i = 1; i < sortedValues.size(); i++) {
      if (sortedValues.get(i - 1) + 1 != sortedValues.get(i)) {
        isStraight = false;
        break;
      }
    }
    if (isStraight) {
      int tempScore = 0;
      int exponent = 0;
      for (Integer value : sortedValues) {
        tempScore += value * Math.pow(10, exponent);
      }
      this.type = HandType.STRAIGHT;
      return tempScore;
    } else {
      return calcThreeOfAKind(cards);
    }
  }

  public int calcThreeOfAKind(final List<Card> cards) {
    final var map = cards.stream()
      .map(Card::getValue)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    if (map.containsValue(3L)) {
      final int baseValue = map.entrySet().stream().filter(v -> v.getValue() == 3L)
        .findFirst().map(Map.Entry::getValue).map(Long::intValue).orElseThrow();
      final var otherCards = cards.stream().filter(v -> v.getValue() != 3L)
        .map(Card::getValue).sorted().collect(Collectors.toList());

      int tempScore = 0;
      int exponent = 0;
      for (Integer value : otherCards) {
        tempScore += value * Math.pow(10, exponent);
      }
      this.type = HandType.THREE_OF_A_KIND;
      return baseValue * 100 + tempScore;
    }
    return calcTwoPairs(cards);
  }

  public int calcTwoPairs(final List<Card> cards) {
    final var map = cards.stream()
      .map(Card::getValue)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    if (map.size() == 3 && map.containsValue(2L) && map.containsValue(1L)) {
      final var baseValues = map.entrySet().stream()
        .filter(v -> v.getValue() == 2L).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
      final var addValue = map.entrySet().stream().filter(v -> v.getValue() == 1L).map(Map.Entry::getKey).findFirst().orElseThrow();
      this.type = HandType.TWO_PAIRS;
      return baseValues.get(1) * 100 + baseValues.get(0) * 10 + addValue;
    }
    return calcPair(cards);
  }

  public int calcPair(final List<Card> cards) {
    final var map = cards.stream()
      .map(Card::getValue)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    if (map.size() == 4 && map.containsValue(2L)) {
      final var baseValue = map.entrySet().stream()
        .filter(v -> v.getValue() == 2L).map(Map.Entry::getKey).findFirst().orElseThrow();
      final var addValues = map.entrySet().stream()
        .filter(v -> v.getValue() != 2L).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
      this.type = HandType.PAIR;
      return baseValue * 1000 + addValues.get(2) * 100 + addValues.get(1) * 10 + addValues.get(0);
    }
    return calcHighestCard(cards);
  }

  public int calcHighestCard(final List<Card> cards) {
    final var sortedCards = cards.stream().map(Card::getValue).sorted().collect(Collectors.toList());
    int tempScore = 0;
    int exponent = 0;
    for (Integer value : sortedCards) {
      tempScore += value * Math.pow(10, exponent);
      exponent++;
    }
    this.type = HandType.HIGHEST_CARD;
    return tempScore;
  }

  public Result compareWith(PokerHand hand) {
    if (this.type == HandType.FULL_HOUSE && hand.type == HandType.FLUSH) {
      return Result.WIN;
    } else if (this.type == HandType.FLUSH && hand.type == HandType.FULL_HOUSE) {
      return Result.LOSS;
    }
    final var comparingResult = Math.signum(this.score - hand.score);
    return comparingResult == 1.0f ? Result.WIN : comparingResult == -1.0f ? Result.LOSS : Result.TIE;
  }

  public enum Result {TIE, WIN, LOSS}

  public enum HandType {
    ROYAL_FLUSH(9), // T J Q K A
    STRAIGHT_FLUSH(8), // 5 6 7 8 9 && same suite
    FOUR_OF_A_KIND(7), // 4
    FULL_HOUSE(6), // 3 + 2
    FLUSH(5), // same suite
    STRAIGHT(4), //  5 6 7 8 9
    THREE_OF_A_KIND(3), // 3
    TWO_PAIRS(2), // 2 + 2
    PAIR(1), // 2
    HIGHEST_CARD(0);

    private final int score;

    HandType(final int score) {
      this.score = score;
    }

    public int getScore() {
      return this.score * 1_000_000;
    }
  }

  public static class Card {
    private static final char[] POSSIBLE_RAW_CARD_VALUES =
      new char[]{'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    private final int value;
    private final char suit;

    public Card(final String raw) {
      this.value = extractCardValue(raw.charAt(0));
      this.suit = raw.charAt(1);
    }

    private static int extractCardValue(final char rawCardValue) {
      for (int i = 0; i < POSSIBLE_RAW_CARD_VALUES.length; i++) {
        if (POSSIBLE_RAW_CARD_VALUES[i] == rawCardValue) {
          return i + 2;
        }
      }
      throw new IllegalArgumentException("cannot recognize card value: " + rawCardValue);
    }

    public int getValue() {
      return this.value;
    }

    public char getSuit() {
      return this.suit;
    }
  }

}

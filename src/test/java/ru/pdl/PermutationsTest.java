package ru.pdl;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class PermutationsTest {

  @Test
  void givenNull_ShouldReturnNull() {
    MatcherAssert.assertThat(Permutations.singlePermutations(null), Matchers.nullValue());
  }

  @Test
  void givenEmptyOrBlankString_ShouldReturnEmptyList() {
    MatcherAssert.assertThat(Permutations.singlePermutations(""), Matchers.is(Collections.EMPTY_LIST));
    MatcherAssert.assertThat(Permutations.singlePermutations("     "), Matchers.is(Collections.EMPTY_LIST));
  }

  @Test
  void givenStringWithOneLetter_ShouldReturnCorrectResult() {
    MatcherAssert.assertThat(Permutations.singlePermutations("a"),
      Matchers.containsInAnyOrder(Collections.singletonList("a").toArray()));
  }

  @Test
  void givenStringWithTwoLetters_ShouldReturnCorrectResult() {
    MatcherAssert.assertThat(Permutations.singlePermutations("ab"),
      Matchers.containsInAnyOrder(Arrays.asList("ab", "ba").toArray()));
  }

  @Test
  void givenStringWithThreeLetters_ShouldReturnCorrectResult() {
    MatcherAssert.assertThat(Permutations.singlePermutations("abc"),
      Matchers.containsInAnyOrder(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba").toArray()));
  }

  @Test
  void givenStringWithTwoDuplicateLetters_ShouldReturnCorrectResult() {
    MatcherAssert.assertThat(Permutations.singlePermutations("aabb"),
      Matchers.containsInAnyOrder(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa").toArray()));
  }

}
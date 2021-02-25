package ru.pdl.codewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterboxPaintSquadTest {
  @Test
  public void ex() {
    assertArrayEquals(new int[]{1,9,6,3,0,1,1,1,1,1}, LetterboxPaintSquad.paintLetterboxes(125,132));
  }
}
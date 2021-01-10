package ru.pdl.codewards;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.pdl.codewards.SimplePigLatin.pigIt;

class SimplePigLatinTest {

  @Test
  void giveNull_shouldReturnNull() {
    assertThat(pigIt(null), Matchers.nullValue());
  }

  @Test
  void giveEmptyString_shouldReturnEmpty() {
    assertThat(pigIt(""), is(""));
    assertThat(pigIt("    "), is("    "));
  }

  @Test
  void giveOneWord_shouldReturnCorrectResult() {
    assertThat(pigIt("b"), is("bay"));
    assertThat(pigIt("bay"), is("aybay"));
  }

  @Test
  void giveFewWordsWithSpaces_shouldReturnCorrectResult() {
    assertThat(pigIt("b g H"), is("bay gay Hay"));
    assertThat(pigIt("Look at him"), is("ookLay taay imhay"));
  }

  @Test
  void giveWordsWithPunctuation_shouldReturnCorrectResult() {
    assertThat(pigIt("This is, good ! yea 111 s."), is("hisTay siay, oodgay ! eayay 111ay say."));
  }

  @Test
  public void FixedTests() {
    assertThat(pigIt("Pig latin is cool"), is("igPay atinlay siay oolcay"));
    assertThat(pigIt("This is my string"), is("hisTay siay ymay tringsay"));
  }

}
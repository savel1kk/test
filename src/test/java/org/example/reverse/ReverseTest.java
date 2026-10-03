package org.example.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void  reverse_ShouldReverseString_ifContainsString() {
        String result = reverse.reverseLetter("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_ShouldReturnEmptyString_ifContainsNull() {
        String result = reverse.reverseLetter(null);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void reverse_returnsEmptyForEmptyInput(){
        String result = reverse.reverseLetter("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_OneLetterRemainsAsItIs(){
        String result = reverse.reverseLetter("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverse_NoChangesIfThereAreNoLetters(){
        String result = reverse.reverseLetter("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverse_ReversalOfOnlyTheLetters () {
        String result = reverse.reverseLetter("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void reverse_NonLetterCharactersAtThEdgesAndInTheMiddle(){
        String result = reverse.reverseLetter("#Ja5va9");
        Assertions.assertEquals("#av5aJ9", result);
    }

    @Test
    public void reverse_shouldKeepCaseOfLetter(){
        String result = reverse.reverseLetter("Ja1Va");
        Assertions.assertEquals("aV1aJ", result);
    }
}

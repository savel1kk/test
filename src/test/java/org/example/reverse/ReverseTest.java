package org.example.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseTest {
    private Reverse reverse = new Reverse();
    @Test
    public void reverse_ShouldReturnEmptyString_ifContainsNull() {
        String result = reverse.reverseLetter(null);
        Assertions.assertEquals(null, result);
    }

    @ParameterizedTest
    @CsvSource ({
            "' ' , ' '",
            "a , a",
            "123 !@#, 123 !@#",
            "J@va the be$t!123, t@eb eht av$J!123",
            "abcd, dcba",
            "#Ja5va9, #av5aJ9",
            "Ja1Va, aV1aJ"
    })
    public void reverse_HandleVariousInput(String input , String result){
        Assertions.assertEquals(result, reverse.reverseLetter(input));
    }
}

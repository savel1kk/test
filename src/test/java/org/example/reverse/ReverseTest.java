package org.example.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    static Stream<Arguments> reverseCases  (){
        return Stream.of(
                Arguments.of(" ", " "),
                Arguments.of("a", "a"),
                Arguments.of("123 !@#", "123 !@#"),
                Arguments.of("J@va the be$t!123", "t@eb eht av$J!123"),
                Arguments.of("abcd", "dcba"),
                Arguments.of("#Ja5va9", "#av5aJ9"),
                Arguments.of("Ja1Va", "aV1aJ"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource ("reverseCases")
    public void reverse_HandleVariousInput(String input , String result){
        Assertions.assertEquals(result, reverse.reverseLetter(input));
    }
}

package com.mzimecki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TextUtilsJunitTest {

    @ParameterizedTest
    @MethodSource("stringIntProvider")
    public void should_return_text_length(String text, int expectedLength) {
        //when
        final TextUtils textUtils = new TextUtils();
        final double length = textUtils.getStringLength(text);

        //then
        assertEquals(expectedLength, length, 0.0);
    }

    private static Stream<Arguments> stringIntProvider() {
        return Stream.of(
                arguments("", 0),
                arguments("one", 3),
                arguments("Monday", 6),
                arguments("Three", 5));
    }

    @Test
    public void should_throw_exception_for_null_text() {
        //when
        final TextUtils textUtils = new TextUtils();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> textUtils.getStringLength(null));
    }

}
package com.rakovets.course.javabasics.practice.statements.looping;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Generator rows of table")
class Task06Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(13524624562456L, "13 524 624 562 456"),
                Arguments.of(-92346234L, "-92 346 234"),
                Arguments.of(123456453456L, "123 456 453 456"),
                Arguments.of(-834563456234L, "-834 563 456 234")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(long amount, String expected) {
        String actual = Task06.convertToAccountingFormat(amount);

        assertEquals(expected, actual);
    }
}
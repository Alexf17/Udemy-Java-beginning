package de.telran.UnitTest;

import de.telran.BinarySearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private static Stream<Arguments> getPositiveTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getPositiveTestData")
    void binSearchPositiveCases(int[] arr, int findMe, int expected) {

        int actual = BinarySearch.binSearch(arr, findMe);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void binSearchNegativeCases(int[] arr) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BinarySearch.binSearch(arr, 2);
        });
        String expectedMessage = "Invalid array";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }


//    @Test
//    void binSearchPositiveCases() {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int findMe = 9;
//        int expected = -1;
//        int actual = BinarySearch.binSearch(arr, findMe);
//        assertEquals(expected, actual);
//
//    }
}
package de.telran.UnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    Utils testUtils;
    int[] actualArr;

    @BeforeEach
    void init() {
        testUtils = new Utils();
    }
    @AfterEach
    void cleanup() {
        testUtils = null;
    }

    @Test
    void getNumbersTest() {
        actualArr = testUtils.getNumber();
        int expectedLength = 8;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};


        Assertions.assertEquals(expectedLength, actualArr.length);
        Assertions.assertArrayEquals(expected, actualArr);
    }

    @Test
    void findMaxEmptyArrTest() {
        int expected=Integer.MIN_VALUE;
        int [] emptyArr = new int[0];
        int actualMax =testUtils.findMax(emptyArr);
        Assertions.assertEquals(expected, actualMax);

    }
    @Test
    void findMaxTest() {
        int expected= 4;
        int [] expectedArr = {1,4,3,2};
        int actualMax =testUtils.findMax(expectedArr);
        Assertions.assertEquals(expected, actualMax);

    }
}
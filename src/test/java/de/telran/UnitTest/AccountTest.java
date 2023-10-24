package de.telran.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void isAccountValidTestNotNull() {
        String expected = null;
        String expected2 = "";
        Account accountTest = new Account();
        assertFalse(accountTest.isAccountValid(expected));
        assertFalse(accountTest.isAccountValid(expected2));
    }

    @Test
    void isAccountValidTestQuantityOfNumbers() {
        String expected = "123456ytrews3e";
        String expected1 = "123456ytrews";
        String expected2 = "swerfvbghytrfde";
        Account accountTest = new Account();

        assertFalse(accountTest.isAccountValid(expected1));
        assertFalse(accountTest.isAccountValid(expected2));
        assertTrue(accountTest.isAccountValid(expected));
    }
    @Test
    void isAccountValidTestAllNumbersNotNull() {
        String expected = "00000000000000";
        String expected1 = "00000000000010";

        Account accountTest = new Account();

        assertFalse(accountTest.isAccountValid(expected));
        assertTrue(accountTest.isAccountValid(expected1));
    }
}
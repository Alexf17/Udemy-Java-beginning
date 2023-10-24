package de.telran.UnitTest;

import java.util.Arrays;

public class UnitTest {
    public static void main(String[] args) {
        Utils utils = new Utils();
        int[] arr = utils.getNumber();
        System.out.println(Arrays.toString(arr));
        int max = utils.findMax(arr);
        System.out.println(max);
    }

}

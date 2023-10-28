package de.telran;

import java.lang.reflect.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int [] search = {0,1,2,3,4,5,6,7,8};
        System.out.println(binSearch(search,9));

    }

    public static int binSearch(int[] array, int findMe) {
        if (array == null || array.length==0){
            throw new IllegalArgumentException("Invalid array");
        }
        if(array.length ==1){
            return array[0] == findMe ? 0 : -1;
        }

        int low = array[0];
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int element = array[middle];
            if (element == findMe) return middle;
            if (element < findMe) low = middle + 1;
            else high = middle-1;
        }
        return -1;
    }
}

package de.telran.UnitTest;

public class Utils {

    public int [] getNumber(){
        int[] array = {1,2,3,4,5,6,7,8};
        return array;
    }

    public int findMax(int[] array){
        if(array == null || array.length ==0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for(int e:array){
            if(e > max){
                max = e;
            }
        }

return max;
    }
}

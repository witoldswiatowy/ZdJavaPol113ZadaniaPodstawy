package Dzien8;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int [] arrayOfInts = {234,1231,2,34534,2,324,3423,523,232};
        int [] arrayOfIntsNew = modifyArray(arrayOfInts);
        System.out.println(Arrays.toString(arrayOfIntsNew));

    }

    private static int[] modifyArray (int [] arrayOfInts){
        for (int i = 0; i < (arrayOfInts.length/2); i++){
            int tmp = arrayOfInts[i];
            arrayOfInts[i] = arrayOfInts[arrayOfInts.length-1-i];
            arrayOfInts[arrayOfInts.length-1-i] = tmp;
        }
        return arrayOfInts;
    }


}

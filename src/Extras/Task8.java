package Extras;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {


        getArrayTwiceOfInts();
    }

    public static int[][] getArrayTwiceOfInts() {
        int[][] arrayOfInts = new int[3][10];
        for (int i = 0; i < arrayOfInts[0].length; i++) {
            arrayOfInts[0][i] = i + 1;
        }
        for (int i = 0; i < arrayOfInts[1].length; i++) {
            arrayOfInts[1][i] = arrayOfInts[0][i] * arrayOfInts[0][i];
        }
        for (int i = 0; i < arrayOfInts[2].length; i++) {
            arrayOfInts[2][i] = arrayOfInts[0][i] * arrayOfInts[0][i] * arrayOfInts[0][i];
        }
        System.out.println(Arrays.toString(arrayOfInts[0]));
        System.out.println(Arrays.toString(arrayOfInts[1]));
        System.out.println(Arrays.toString(arrayOfInts[2]));
        return arrayOfInts;
    }
}


package Dzien8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        int [] arrayOfInts = getRandomArrayOfInts();
        System.out.println(Arrays.toString(arrayOfInts));
        int [] arrayOfIntsAfterSort = sortArrayOfInts(arrayOfInts);
        reader(arrayOfIntsAfterSort);
    }
    private static int [] getRandomArrayOfInts (){
        Random generator = new Random();
        int [] arrayOfInts = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++){
            int tmp = generator.nextInt(10);
            arrayOfInts[i] = tmp;
        }
        return arrayOfInts;
    }

    private static int [] sortArrayOfInts (int [] arrayOfInts) {
        int [] arrayAfterSort = new int[10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
            if (arrayOfInts[j] == i) {
                arrayAfterSort[i]++;
            }
            }
//            switch (arrayOfInts[i]){
//                case 0:
//                    arrayAfterSort[0]++;
//                case 1:
//            }
        }
        return arrayAfterSort;
    }

    private static void reader (int [] arrayOfInts){
        System.out.println();
        for (int i = 0; i < arrayOfInts.length; i++){
            System.out.println("Cyfra " + i + " pojawiła się " + arrayOfInts[i]);
        }
    }

}


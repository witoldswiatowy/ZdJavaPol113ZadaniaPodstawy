package Dzien8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        int [][] arrayOfInts1 = arrayDoubleOfIntsGenerator();
        int [][] arrayOfInts2 = arrayDoubleOfIntsGenerator();
        readerDoubleArray(arrayOfInts1);
        readerDoubleArray(arrayOfInts2);
        int sum1 = sumOfDoubleArray(arrayOfInts1);
        System.out.println(sum1);
        int sum2 = sumOfDoubleArray(arrayOfInts2);
        System.out.println(sum2);
        System.out.print("Tablica z największą sumą to: ");
        readerDoubleArray(whichSumIsBigger(arrayOfInts1, arrayOfInts2));
        System.out.print("Największa liczba to: ");
        System.out.println(getBiggestValue(arrayOfInts1,arrayOfInts2));



    }
    private static int [][] arrayDoubleOfIntsGenerator (){
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie parametry ma mieć tablica? Podaj dwie wartości.");
        int firstLenghtArray = scanner.nextInt();
        int secondLenghtArray = scanner.nextInt();
        System.out.println("Tablica będzie " + firstLenghtArray + " na " + secondLenghtArray);
        int [][] arrayTwiceVolue = new int[firstLenghtArray][secondLenghtArray];

        for (int i = 0; i < firstLenghtArray; i++){
            for (int j = 0; j < secondLenghtArray; j++){
             arrayTwiceVolue[i][j] = generator.nextInt(100);
            }
        }
        return arrayTwiceVolue;
    }

    private static void readerDoubleArray (int [][] arrayOfInts){
        for (int i = 0; i < arrayOfInts.length; i++){
            System.out.print(" {");
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                System.out.print(arrayOfInts[i][j]);
                if(j != arrayOfInts[i].length - 1) {
                System.out.print(", ");
                }
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    private static int sumOfDoubleArray (int [][] arrayOfInts) {
        int sumOfArray1 = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                sumOfArray1 += arrayOfInts[i][j];
            }
        }
        return sumOfArray1;
    }

    private static int [][] whichSumIsBigger(int [][] arrayOfInts1,int [][] arrayOfInts2 ) {
        int sumOfArray1 = sumOfDoubleArray(arrayOfInts1);
        int sumOfArray2 = sumOfDoubleArray(arrayOfInts2);

        if (sumOfArray1 > sumOfArray2) {
            return arrayOfInts1;
        }
//        else if (sumOfArray1 < sumOfArray2) {
//            return arrayOfInts2;
//        }
        return arrayOfInts2;
    }

    private static int getBiggestValue (int [][] arrayOfInts, int [][] arrayOfInts2) {
        int theBiggestValue = arrayOfInts[0][0];
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (theBiggestValue < arrayOfInts[i][j]) {
                    theBiggestValue = arrayOfInts[i][j];
                }
            }
        }
        for (int i = 0; i < arrayOfInts2.length; i++) {
            for (int j = 0; j < arrayOfInts2[i].length; j++) {
                if (theBiggestValue < arrayOfInts2[i][j]) {
                    theBiggestValue = arrayOfInts2[i][j];
                }
            }
        }
        return theBiggestValue;
    }


}

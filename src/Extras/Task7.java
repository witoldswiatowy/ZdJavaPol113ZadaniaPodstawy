package Extras;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int[][] arrayOfInts = new int[3][3];
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayOfInts[i][j] = counter;
                counter++;
            }
        }
        System.out.println(Arrays.toString(arrayOfInts[0]));
        System.out.println(Arrays.toString(arrayOfInts[1]));
        System.out.println(Arrays.toString(arrayOfInts[2]));

        getSumOfDiagonal(arrayOfInts);
        getSumOfEdgesElement(arrayOfInts);
    }

    public static void getSumOfDiagonal(int[][] arrayTwice) {
        int sumOFDiagonal = 0;
        for (int i = 0; i < arrayTwice[0].length; i++) {
            for (int j = 0; j < arrayTwice[i].length; j++) {
//                if ((i == 0 && j == 0) ||
//                    (i == 0 && j == arrayTwice.length - 1) ||
//                    (i == arrayTwice.length - 1 && j == 0) ||
//                    (i == arrayTwice.length - 1 && j == arrayTwice.length - 1)) {
//                        sumOFDiagonal += arrayTwice[i][j];
//                }
                if (i == j) {
                    sumOFDiagonal += arrayTwice[i][j];
                }
                if (i + j == arrayTwice.length - 1) {
                    sumOFDiagonal += arrayTwice[i][j];
                }
            }
        }
        System.out.println(sumOFDiagonal);
    }

    public static void getSumOfEdgesElement(int[][] arrayTwice) {
        int sumOfEdges = 0;
        for (int i = 0; i < arrayTwice[0].length; i++) {
            for (int j = 0; j < arrayTwice[i].length; j++) {
                if (i == 0 || i == arrayTwice.length - 1){
                    sumOfEdges += arrayTwice[i][j];
                }
                else if (j == 0 || j == arrayTwice.length -1 ){
                    sumOfEdges += arrayTwice[i][j];
                }
            }
        }
        System.out.println(sumOfEdges);
    }

}

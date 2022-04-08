package Dzien8;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        int [] arrayExample = {1231,232,2,4,-1,-424,123134,24,-12,232};

//        int [] arrayOfInts = arrayExample;
        int [] arrayOfInts = getIntsFromUser();
        System.out.println(Arrays.toString(arrayOfInts));
        int [] arrayOfInts1 = sortArrayOfInts(arrayOfInts);
        System.out.println(Arrays.toString(arrayOfInts1));

    }

    private static int [] getIntsFromUser (){
        Scanner scanner = new Scanner(System.in);
        int [] arrayOfInts = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++){
            System.out.print("Please insert your " + (i+1) + " number ");
//            if (valid)
            arrayOfInts[i] = scanner.nextInt();
        }
        return arrayOfInts;
    }

    private static int [] sortArrayOfInts (int [] arrayOfInts) {
        for (int i = 0; i < arrayOfInts.length-1; i++){
            for(int j = 0; j < arrayOfInts.length -1; j++) {
                if (arrayOfInts[j] > arrayOfInts [j+1]){
                    int tmp = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[j + 1];
                    arrayOfInts[j + 1] = tmp;
                }
            }
        }
//        for (int i = 0; i < arrayOfInts.length; i++){
//            //zrobić sortowanie babelkowe, czyli porównać pary obok siebie i kazdy obrot n-1 ciagu.
//            //albo przerobic to moje i zamienic mniejsze na wieksze?
//            for (int j = i + 1; j < arrayOfInts.length - i; j++){
//                int  tmp = arrayOfInts[i];
//                if (arrayOfInts[i]>arrayOfInts[j]){
//                    arrayOfInts[i] = arrayOfInts[j];
//                    arrayOfInts[j] = tmp;
//                }
        return arrayOfInts;
    }

//    private static boolean isValid (int number){
//        if (number )
//            //można zrobić input na stringa i wyrażeniem regularnym zobaczyć czy jest to liczba
//        return
//    }
}

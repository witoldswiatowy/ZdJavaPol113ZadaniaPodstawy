package Dzien8;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {

        int [] inputs = {12,-7,19,-5};
        int [] newArray = arrayOfMinusValue(inputs);
//        int [] newArray = createNewArray(inputs); coś nie tak tu jest
        writer(newArray);
        System.out.println(Arrays.toString(newArray)); // nie trzeba pisać dodatkowo metody do wyświetlenia

    }

    private static void createNewArray (int [] inputs){
        if (numberOfMinus(inputs) != 0){
            arrayOfMinusValue(inputs);
        }
        else {
            System.out.println("W tablicy nie ma wartości ujemnych");
        }
    }

    private static int numberOfMinus (int [] inputs){
        int minusNumber = 0;
        for (int number : inputs)
            if (number < 0){
                minusNumber++;
            }
        return minusNumber;
    }

    private static int[] arrayOfMinusValue (int [] inputs) {
//        int [] minusArray = new int[arrayLenght];
        int[] minusArray = new int[numberOfMinus(inputs)];
//        int counter = 0;
        for (int i = 0, counter = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                minusArray[counter] = inputs[i];
                counter++;
            }
        }
        return minusArray;
    }

    private static void writer (int [] inputs){
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]);
        }
    }
}

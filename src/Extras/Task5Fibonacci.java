package Extras;

public class Task5Fibonacci {
    public static void main(String[] args) {

        int numberTest = getFibonacciNumberFromNumber(25);
        System.out.println(numberTest);

    }
    public static int getFibonacciNumberFromNumber (int number) {
        int [] arrayOfFibonacci = new int[number];
        arrayOfFibonacci[0] = 1;
        arrayOfFibonacci[1] = 1;
        for (int i = 2; i < number; i++){
            arrayOfFibonacci[i] = arrayOfFibonacci[i-2] + arrayOfFibonacci[i-1];
        }
        return arrayOfFibonacci[number-1];
    }

}

package Dzien7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit= scanner.nextInt();

        int sum = sumOfTheSequence(firstDigit, secondDigit);

        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit, int secondDigit) {
        int sum = 0;
        if (firstDigit > secondDigit){
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        for (int i = firstDigit; i <= secondDigit; i++){
            sum += i;
        }

//        for (; firstDigit <= secondDigit; firstDigit++) {
//            sum += firstDigit;
//        } //dla zabawy, ale mniej czytelna

//        while(firstDigit<=secondDigit) {
//            sum += firstDigit;
//            firstDigit++;
//        }

//        do {
//            sum += firstDigit;
//            firstDigit++;
//        }while (firstDigit<=secondDigit);

        return sum;
    }



}

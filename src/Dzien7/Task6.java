package Dzien7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        multiplicationTable(5);
        System.out.println();

        System.out.print("multiplier: ");
        int multiplier = scanner.nextInt();
        System.out.print("minMultiplier: ");
        int minMultiplier = scanner.nextInt();
        System.out.print("maxMultiplier: ");
        int maxMultiplier = scanner.nextInt();

        multiplicationTablePro(multiplier, minMultiplier, maxMultiplier);
    }

    private static void multiplicationTable (int a) {
        for (int i = 1; i < 5; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }

    private static void multiplicationTablePro (int multiplier, int minMultiplier, int maxMultiplier) {
        for (int i = minMultiplier; i <= maxMultiplier; i++) {
            int result = multiplier * minMultiplier;
            System.out.println(multiplier + " x " + i + " = " + result);
        }

//        while(minMultiplier <= maxMultiplier) {
//            int result = multiplier * minMultiplier;
//            System.out.println(multiplier + " x " + minMultiplier + " = " + (multiplier * minMultiplier));
//            minMultiplier++;
//        }

    }

}

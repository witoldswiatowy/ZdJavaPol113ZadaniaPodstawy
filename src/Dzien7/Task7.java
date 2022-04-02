package Dzien7;

import java.util.Scanner;

public class Task7 {

    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.println("Please insert firstDigit: ");
            float numberFirst = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Please insert operator: ");
            String mathematicOperator = scanner.nextLine();
            System.out.println("Please insert secondDigit: ");
            float numberSecond = scanner.nextFloat();

            float result = calculate(numberFirst, mathematicOperator, numberSecond);

            System.out.println(result);
            System.out.print("New calculation or Stop?");
            decision = scanner.nextLine();
//        }while (decision.equals("Stop")); bo tutaj może byc nullPointerExeption
        }while (!STOP_DECISION.equals(decision));
    }

    private static float calculate(float numberFirst, String mathematicOperator, float numberSecond) {

        return 0;
    }


}

package Dzien7;

public class Task9 {
    public static void main(String[] args) {
        int rangeFrom = 1;
        int rangeTo = 16;
        for (int i = rangeFrom; i <= rangeTo; i++){
            System.out.println(fizzBuzz(i));

//            if (i % 3 == 0){
//                System.out.println("Fizz");
//                if (i % 5 == 0){
//                    System.out.println("Buzz");
//                }
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
        }
    }

    private static String fizzBuzz(int number) {
//        if (number % 3 == 0 && number % 5 == 0){ // bo to są dwie operacje
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}

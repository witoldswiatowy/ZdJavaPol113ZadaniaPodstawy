package Dzien7;

public class Task8 {
    public static void main(String[] args) {



        numberOfUser(100);

    }

    private static boolean isPrimeNumber (int number){
        if (number <= 2) {
            return false;
        }
        for (int i = 2; i <= number/2; i++){
            if (number %i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void numberOfUser (int a){
        System.out.println("Prime numbers is: ");
        for (int i = 0; i < a; i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}

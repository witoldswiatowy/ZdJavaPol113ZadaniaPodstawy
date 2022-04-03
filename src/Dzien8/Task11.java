package Dzien8;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(isPalindrome(input));
        input = "Kajak";
        System.out.println(isPalindrome(input));

    }

    private static boolean isPalindrome (String input) {
        String inputAfterReverse = new StringBuilder(input).reverse().toString();
        return input.equals(inputAfterReverse);
    }
}

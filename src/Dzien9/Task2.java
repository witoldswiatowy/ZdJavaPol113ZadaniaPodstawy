package Dzien9;

import java.util.regex.Pattern;

public class Task2 {

    private static final String IBAM_VALIDATOR = "PL+[0-9]{26}";

    public static void main(String[] args) {

        System.out.println(isCorrectIBAN("PL12345678901234567890123456"));
        System.out.println(isCorrectIBAN("12345678901234567890123456"));
        System.out.println(isCorrectIBAN("APL12345678901234567890123456"));
        System.out.println(isCorrectIBAN("PLPL12345678901234567890123456"));

    }
    private static boolean isCorrectIBAN (String numberIban){
        //musi miec PL i 26 cyfr
        Pattern pattern = Pattern.compile(IBAM_VALIDATOR);

        return pattern.matcher(numberIban).matches();
    }

}

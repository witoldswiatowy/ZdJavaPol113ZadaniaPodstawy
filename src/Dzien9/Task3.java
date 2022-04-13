package Dzien9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final String NUMBER_FORMAT_VALIDATOR = "[0-9]+(,[0-9]+)?";

    public static void main(String[] args) {

        System.out.println(isCorrectDigit("213,23"));
        System.out.println(isCorrectDigit("213,2332131"));
        System.out.println(isCorrectDigit("213"));
        System.out.println(isCorrectDigit("213.231"));
        System.out.println(isCorrectDigit("213,ads"));
        System.out.println(isCorrectDigit(",ads"));
        System.out.println(isCorrectDigit(",21313"));
        System.out.println(isCorrectDigit("21312,"));

    }

    private static boolean isCorrectDigit (String digitWord){
        Pattern pattern = Pattern.compile(NUMBER_FORMAT_VALIDATOR);
        Matcher matches = pattern.matcher(digitWord);
        return pattern.matcher(digitWord).matches();
    }

}

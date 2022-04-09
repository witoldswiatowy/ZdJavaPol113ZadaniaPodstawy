package Dzien9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

//    private static final String REGEX = "a+ [Pp]sik ";
//    private static final String REGEX = "a+ (Psik|psik) ";
    private static final String REGEX = "a{1,} (Psik|psik) ";

    public static void main(String[] args) {

    }

    private static boolean isAInInput (String input){
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(input).matches();
    }
}

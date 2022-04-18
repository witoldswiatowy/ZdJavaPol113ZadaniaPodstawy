package Dzien9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

//    private static final String EMAIL_VALIDATOR = "[A-Za-z0-9._-]+@[a-z]+(\\.[a-z]+)?";
    private static final String EMAIL_VALIDATOR = "[\\w\\d._-]+@\\w+(\\.\\w+)?";

    public static void main(String[] args) {
        System.out.println(isCorrectFormat("sda@com."));


    }
    private static boolean isCorrectFormat (String emailAddress) {
        /*
        a? -> zero or one
        a* -> zero or more
        a+ -> one or more
        \d -> dowolna cyfra
        \w -> dowolna litera
        {2} -> muszą być 2 te znaki
         */

        /*
            true:
            xyz@com
            xyz@com.pl
            xyz_.-@com.pl
            123xyz123@com.pl

            false:
            sad.com.pl
            @sda
            sda@
            sda!@com.pl
            @
            sad@com.

         */

        Pattern pattern = Pattern.compile(EMAIL_VALIDATOR);
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
        return pattern.matcher(emailAddress).matches();
    }
}

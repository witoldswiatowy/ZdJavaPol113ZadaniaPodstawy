package Dzien8;

import java.util.Locale;

public class Task1 {

    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        System.out.println(getLastChar("Ala"));


    }

    private static char getLastChar (String word){
        if (word != null && !word.isBlank()) {
            char lastChar = word.charAt(word.length() - 1);
            return lastChar;
        }
        return DEFAULT_CHAR;
    }
}

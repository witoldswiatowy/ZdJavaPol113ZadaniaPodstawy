package Dzien8;

public class Task8WithStringBuilder {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 95;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {

        String input = "Ala ma kota";
        String result = changeUpperLowerCase(input);
        System.out.println(result);
    }

    private static String changeUpperLowerCase (String input){
        if (StringHelper.isValid(input)){
            //65-90   97-122
            StringBuilder resultsb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (isUpperLetter(currentChar)) {
                    resultsb.append((char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else if (isLowerLetter(currentChar)){
                    resultsb.append ((char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else{
                    resultsb.append(currentChar);
                }
            }
            return resultsb.toString();
        }
        return input;
    }

    private static boolean isUpperLetter(char currentChar) {
        return currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII;
    }
    private static boolean isLowerLetter(char currentChar) {
        return currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII;
    }
}

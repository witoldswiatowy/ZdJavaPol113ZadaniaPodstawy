package Dzien8;

public class Task8 {

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
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (isUpperLetter(currentChar)) {
                    result += (char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII);
//                    result = result.concat(String.valueOf(currentChar + 32));
                } else if (isLowerLetter(currentChar)){
                    result += (char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII);
                } else{
                    result += currentChar;
                }
            }
            return result;
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

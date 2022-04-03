package Dzien8;

public class Task5 {
//    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {

        String input = "Ala ma kota";
        char searchCharacter = 'a';
        int result = howManyCharInWord(input, searchCharacter);
        System.out.println(result);
    }

    private static int howManyCharInWord (String input, char searchCharacter){
        int counter = 0;
//        if (StringHelper.isValid(input) && searchCharacter != DEFAULT_CHAR) {
        if (StringHelper.isValid(input) && input.contains(String.valueOf(searchCharacter))) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i)==searchCharacter){
                    counter++;
                }
            }
        }
        return counter;
    }
}

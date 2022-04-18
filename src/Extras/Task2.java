package Extras;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 95;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {

        int a = differenceBetweenLetter(getCharFromString(getLetterFromUser()));
        System.out.println(a);

    }

    public static int differenceBetweenLetter(char[] arrayOfChars) {
        int numberOfFirstLetter = arrayOfChars[0];
        int numberOfSecondLetter = arrayOfChars[1];
        int differenceBetweenLetter = numberOfFirstLetter - numberOfSecondLetter;
        return differenceBetweenLetter;
    }

    public static char[] getCharFromString(String twoLetter) {
        char[] arrayOfTwoChars = new char[2];
        arrayOfTwoChars[0] = twoLetter.charAt(0);
        arrayOfTwoChars[1] = twoLetter.charAt(1);
        return arrayOfTwoChars;
    }

    public static String getLetterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert only two letter");
        String twoLetter = scanner.nextLine();
        String correctTwoLetter = "aa";
        if (validatorOfNumber(twoLetter)) {
            correctTwoLetter = modificatorWord(twoLetter);
        } else {
            System.out.println("Somthing is wrong.");
        }
        return correctTwoLetter;
    }

    public static boolean validatorOfNumber(String word) {    //zrobić to regexem
        if (word.length() > 2) {
            System.out.println("You input more than two letter. I check only two first letter: " + word.charAt(0) + word.charAt(1));
        }
        Pattern pattern = Pattern.compile("[A-Za-z]{2}");
        return pattern.matcher(word).matches();
    }

    public static String modificatorWord (String word){
        StringBuilder operationWord = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            char currentChar = word.charAt(i);
            if (currentChar >= VALUE_LOWER_A_IN_ASCII) {
                currentChar -= DIFF_UPPER_AND_LOWER_IN_ASCII;
                operationWord.append(currentChar);
            } else {
                operationWord.append(word.charAt(i));
            }
        }
        return operationWord.toString();
    }
}

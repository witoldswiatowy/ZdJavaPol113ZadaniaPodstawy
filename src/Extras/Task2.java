package Extras;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

    }

    public static int differenceBetweenLetter (char firstLetter, char secondLetter){
        int numberOfFirstLetter = firstLetter;
        int numberOfSecondLetter = secondLetter;
        int differenceBetweenLetter = numberOfFirstLetter - numberOfSecondLetter;
        return differenceBetweenLetter;
    }

    public static char [] getCharFromString (String twoLetter){
        char [] arrayOfTwoChars = new char[twoLetter.length()];
        arrayOfTwoChars[0] = twoLetter.charAt(0);
        arrayOfTwoChars[1] = arrayOfTwoChars[1];
        if (twoLetter.length() > 2){
            System.out.println("You input more than two letter. I check only two first letter");
        }
        return arrayOfTwoChars[];
    }
    public static String getLetterFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert only two letter");
        String twoLetter = scanner.nextLine();
        if ()
        return twoLetter;
    }
    public static boolean validator (String word){    //zrobić to regexem
        Pattern pattern = Pattern.compile("[A-Za-z]{2}");


        return false;
    }

}

package Dzien8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        specialWriter(wordFromUser(howManyWord()));

    }

    private static int howManyWord (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many word would you like insert?");
        return scanner.nextInt();
    }

    private static String [] wordFromUser (int numberOfWord){

        Scanner scanner = new Scanner(System.in);
        String [] arrayOfStrings = new String[numberOfWord];
        System.out.println("Enter the word/s");
        for (int i = 0; i < numberOfWord; i++){
            System.out.print("" + (i+1) + ": ");
            arrayOfStrings[i] = scanner.nextLine();
            if (arrayOfStrings[i].equals("")){
                int counter = 0;
                do {
                    System.out.println("Insert is empty, try again");
                    arrayOfStrings[i] = scanner.nextLine();
                    counter++;
                    if (counter == 9){
                        System.out.println("Przerywam program");
                        break;
                    }
                }while (arrayOfStrings[i].equals(""));
            }
        }
    return arrayOfStrings;
    }

    private static void specialWriter (String [] arrayOfStrings){
        for (int i = 0; i < arrayOfStrings.length; i++){
            if (arrayOfStrings[i].equals("")){
                break;
            }
            System.out.print("Result: ");
            for (String insert : arrayOfStrings) {
                System.out.print(insert.charAt(insert.length()-1));
            }
        }
    }
}

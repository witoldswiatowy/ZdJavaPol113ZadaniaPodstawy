package Dzien8;

import java.util.Scanner;

public class Task12 {

        private static final int VALUE_UPPER_A_IN_ASCII = 65;
        private static final int VALUE_UPPER_Z_IN_ASCII = 95;
        private static final int VALUE_LOWER_A_IN_ASCII = 97;
        private static final int VALUE_LOWER_Z_IN_ASCII = 122;

        //szyfr cezara, przesunięcie danej litery w tekscie o długość key, wziąć tablice ascii, małe litery są
        public static void main(String[] args) {

            System.out.println(inputToCode(getInputFromUser(),getKeyToCode()));
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append((char)97);
//            System.out.println(sb1);

    }
    private static String getInputFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the words: ");
        String inputFromUser = scanner.nextLine();
        if (inputFromUser.equals("")){
            int counter = 0;
            do {
                System.out.println("Insert is empty, try again");
                inputFromUser = scanner.nextLine();
                counter++;
                if (counter == 9){
                    System.out.println("Dziesięć nieudanych prób. Przerywam program");
                    break;
                }
            }while (inputFromUser.equals(""));
        }
        return inputFromUser;
    }

    private static int getKeyToCode (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the kay: ");
        return scanner.nextInt();
    }

    private static String inputToCode (String inpute, int key){
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < inpute.length(); i++){
            if (inpute.charAt(i) == ' '){
                continue;
            }
            if ((int)inpute.charAt(i) < VALUE_UPPER_Z_IN_ASCII - key){
                char secretLetter = (char) (inpute.charAt(i) + key);
                resultSb.append(secretLetter);
            }
            if ((int)inpute.charAt(i) > VALUE_UPPER_Z_IN_ASCII - key && (int)inpute.charAt(i) < VALUE_LOWER_A_IN_ASCII) {
                int tmpLetter = VALUE_UPPER_A_IN_ASCII + (((char) inpute.charAt(i) + key) - VALUE_UPPER_Z_IN_ASCII);
                char secretLetter = (char) tmpLetter;
                resultSb.append(secretLetter);
            }
            if ((int)inpute.charAt(i) < VALUE_LOWER_Z_IN_ASCII - key && (int)inpute.charAt(i) > VALUE_UPPER_Z_IN_ASCII) {
                char secretLetter = (char) (inpute.charAt(i) + key);
                resultSb.append(secretLetter);
            }
            if ((int)inpute.charAt(i) > VALUE_LOWER_Z_IN_ASCII - key && (int)inpute.charAt(i) < VALUE_UPPER_Z_IN_ASCII - key) {
                int tmpLetter = VALUE_LOWER_A_IN_ASCII + (((char)inpute.charAt(i)+key) - VALUE_LOWER_Z_IN_ASCII);
                char secretLetter = (char)tmpLetter;
                resultSb.append(secretLetter);
            }
//            switch (inpute.charAt(i)) {
//                case (' '):
//                    continue;
//                case ()
//            }
        }
        return resultSb.toString();
    }
}

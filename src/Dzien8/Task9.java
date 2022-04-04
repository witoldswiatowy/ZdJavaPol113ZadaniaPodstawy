package Dzien8;

import java.util.Scanner;

public class Task9 {

    private static final String END_CONDITION_ENOUGH = "Enough";

    public static void main(String[] args) {

        System.out.println(task9programm());
    }

    private static String getStringFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your text: ");
        return scanner.nextLine();
    }

    private static String task9programm (){
        String longerString = "nothing";
        String stringToCompare = "";
        do {
            longerString = getStringFromUser();
//            longerString = null;
            if (longerString == null){
                System.out.println("Nie wiem jak to zrobiłeś, ale wprowadziłeś nic...");
                break;
            }
            if (longerString.equals("")){
                System.out.println("No input");
                continue;
            }
            if (longerString.length() > stringToCompare.length() && !longerString.equals(END_CONDITION_ENOUGH)){
                stringToCompare = longerString;
            }
        }while (!longerString.equals(END_CONDITION_ENOUGH));
        return stringToCompare;
    }
//        String tmp2 = "nothing";
//        String longerString = "nothing";
//        do{
//            String longerString = getStringFromUser();
//            if (longerString.length()>tmp2.length()){
//                tmp2 = longerString;
//            }
//            System.out.println(longerString);
//        }while(!longerString.equals("Enough"));
//        return tmp2;
}
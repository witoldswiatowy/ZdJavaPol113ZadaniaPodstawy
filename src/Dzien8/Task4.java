package Dzien8;

public class Task4 {

    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {

        String input = " Ala, ma kota. Kot, ma Ale.";
        String result = changeWord(input);
        System.out.println(result);

    }
    private static String changeWord (String input){
        if (StringHelper.isValid(input)){
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",",REPLACEMENT);

//            String tmp = input.replace(".", "-STOP-");
//            return tmp.replace(",","-STOP-");                //dwa sposoby na to samo, ale co ładniej wyglada

        return input.replaceAll("[.,]", REPLACEMENT);
        }

        return input;
    }

}

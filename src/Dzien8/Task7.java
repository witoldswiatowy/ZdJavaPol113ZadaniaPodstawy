package Dzien8;

public class Task7 {
    public static void main(String[] args) {

        String input = "Ala ma kota";

        System.out.println("Procent spacji w danym zdaniu to: " + howManySpaceInWord(input));

    }
    private static double howManySpaceInWord (String input) {
        int counter = 0;
        char space = ' ';
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == space){
                counter++;
            }
        }
//        System.out.println(counter);
//        System.out.println(input.length());
        double result = 100/((double)input.length()/counter);
//        System.out.println(result);
        return result;
    }

}

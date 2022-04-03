package Dzien8;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";

        boolean result = isPrefixInInput(input, prefix);
        System.out.println(result);

        boolean result1 = isPrefixInInput(input, null);
        System.out.println(result1);

    }

    private static boolean isPrefixInInput (String input, String prefix){
//        if (input != null && !input.isBlank() && prefix != null && !prefix.isBlank()) { //ale ton jest juz troche potworek
        if (StringHelper.isValid(input) && StringHelper.isValid(prefix)){
            return input.startsWith(prefix);
        }
        return false;
    }

}

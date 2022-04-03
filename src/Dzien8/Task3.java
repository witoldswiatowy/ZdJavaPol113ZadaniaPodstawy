package Dzien8;

public class Task3 {
    public static void main(String[] args) {

        String input = "Ala ma kota";
        String word  = "ma";
        int result = getIndex(input, word);
        System.out.println(result);

        input = "Ala ma kota";
        word  = "";
        result = getIndex(input, word);
        System.out.println(result);

        input = "Ala ma kota";
        word  = null;
        result = getIndex(input, word);
        System.out.println(result);

    }
    private static int getIndex (String input, String word) {
    if (StringHelper.isValid(input) && StringHelper.isValid(word)){
//        boolean result = input.contains(word);
//        if (result){
//         return input.indexOf(word); //indexOf juz zwraca -1 jesli nie ma wyrazenia
//        }
        return input.indexOf(word);
    }
        return -1;
    }

}

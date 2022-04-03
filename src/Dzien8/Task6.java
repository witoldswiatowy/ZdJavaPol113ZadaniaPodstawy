package Dzien8;

public class Task6 {
    public static void main(String[] args) {

        String input = "Ala ma kota";
        char searchCharacter = 'a';
        int result = firstIndexOFChar(input, searchCharacter);
        System.out.println(result);

        input = "Ala ma kota";
        searchCharacter = 'z';
        result = firstIndexOFChar(input, searchCharacter);
        System.out.println(result);
    }

    private static int firstIndexOFChar(String input, char searchChar) {
//        int counter = 0;
//        if (StringHelper.isValid(input) && input.contains(String.valueOf(searchChar))) {
//            for (int i = 0; i < input.length(); i++) {
//                if (input.charAt(i)==searchChar){
//                    counter = i; //odrazu można "return i" i return przyrywa for'a
//                    break;
//
//                }
//            }
//        }
//        else {
//            counter = -1;
//        }
//        return counter;
//    }
////    to było moje xD

        if (StringHelper.isValid(input)) {
            return input.indexOf(searchChar);
        }
        return -1;
    }
}


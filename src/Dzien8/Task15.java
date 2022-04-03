package Dzien8;

public class Task15 {
    public static void main(String[] args) {

        String [] firstArray0 = {"ala","ma","kota"};
        String [] secondArray0 = {"ala","ma","kotaa"};

        System.out.println(compareStingArray(firstArray0,secondArray0));

        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(compareStingArray(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(compareStingArray(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(compareStingArray(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(compareStingArray(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(compareStingArray(firstArray4, secondArray4));

    }

    private static boolean compareLenghtArray (String [] firstArray, String [] secondArray){
        if (firstArray.length == secondArray.length){
        return true;
        }
        return false;
    }

    private static boolean compareStingArray (String [] firstArray, String [] secondArray) {
        if (compareLenghtArray(firstArray, secondArray)) {
            for (int i = 0; i < firstArray.length; i++) {
                if(firstArray[i] == null && secondArray[i] == null) {
                    continue;
                }
                if(firstArray[i] == null || !firstArray[i].equals(secondArray[i])) {
                    return false;
                }
//                if(firstArray[i] == null || secondArray[i] == null) {
//                    return false;
//                }
//                if (!firstArray[i].equals(secondArray[i])) {
//                    return false;
//                }
            }
            return true;
        }
        return false;
    }
}

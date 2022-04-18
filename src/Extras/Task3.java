package Extras;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int [] input = {0,4124,24,424,9,0,-1,2,-4,0,43};
//        int [] input = {0,24,0,43};
        System.out.println(Arrays.toString(input));
        int [] output = getZeroToEnding(input);
        System.out.println(Arrays.toString(output));


    }
    public static int [] getZeroToEnding (int [] arrayOFInts){
        for (int i = 0; i < arrayOFInts.length; i++){
            if (arrayOFInts[i] == 0){
                int tmp = arrayOFInts[i];
                for (int j = i; j < arrayOFInts.length - 1; j++){
                    arrayOFInts[j] = arrayOFInts[j+1];
                }
                arrayOFInts[arrayOFInts.length-1] = tmp;
            }
        }
        return arrayOFInts;
    }

}

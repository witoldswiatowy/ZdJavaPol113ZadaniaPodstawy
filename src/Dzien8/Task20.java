package Dzien8;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {

        System.out.print("Result: ");
        System.out.println(Arrays.toString(generateArithmeticProgression(5,2,4)));
    }
    private static int [] generateArithmeticProgression (int length, int firstElement , int odds){
        int [] arrayOfArithmeticProgession = new int[length];
        arrayOfArithmeticProgession[0] = firstElement;
        for (int i = 1; i < length; i++){
            arrayOfArithmeticProgession[i] = arrayOfArithmeticProgession[i-1] + odds;
        }
        return arrayOfArithmeticProgession;
    }
}

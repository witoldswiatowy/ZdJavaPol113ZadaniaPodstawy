package Dzien8;

public class Task13 {
    public static void main(String[] args) {

        int [] inputs = {12,19,7};

        int [] inputs2 = new int[3];
        inputs2[0] = 12;
        inputs2[1] = 19;
        inputs2[2] = 7;

        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(getSumValue(inputs));

    }

    private static int getMinValue (int [] inputs){
        int minValue = inputs[0];
////        int minValue = Integer.MAX_VALUE;
//        for (int i = 1; i < inputs.length; i++){
//            int currentElement = inputs[i];
//            if(currentElement < minValue){
//                minValue = currentElement;
//            }
//        }

        for(int element : inputs){
            if(element < minValue){
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue (int [] inputs){
        int maxValue = inputs[0];

        for(int element : inputs){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int getSumValue (int [] inputs){
        int sumValue = 0;
        for(int element : inputs){
                sumValue += element;
        }
        return sumValue;
    }
}

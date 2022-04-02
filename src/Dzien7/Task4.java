package Dzien7;

import java.util.Scanner;

public class Task4 {

    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;

    public static void main(String[] args) {
        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        System.out.println(calculateBMI(weight, height));
        float bmi = calculateBMI(weight,height);
        isBMIIsNormal(bmi);
    }

    static Scanner scanner = new Scanner(System.in);
    private static float getWeightFromUser(){
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser(){
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();
    }

    private static float calculateBMI (float weight, int height){
    float heightInMeter = height/100F;
    return weight/(float)Math.pow(heightInMeter,2);
    }

    private static void isBMIIsNormal (float bmi){
        if (bmi > BMI_MIN_RANGE && bmi < BMI_MAX_RANGE) {
            System.out.println("BMI is correct");
        }
        else {
            System.out.println("BMI is incorrect");
        }
    }
}

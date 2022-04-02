package Dzien7;

import java.util.Scanner;

public class Task2 {
    public static final float PI = 3.13F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser()/2;


        System.out.println(CircumferenceOfACircle(radius));
        System.out.println(AreaOfACircle(radius));

    }
    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
//        float diametry = scanner.nextFloat();
//        return diametry;
        return scanner.nextFloat();
    }


    private static float CircumferenceOfACircle (float radius){
        float CircumferenceOfACircle = 2 * PI * radius;
        return CircumferenceOfACircle;
    }
    private static float AreaOfACircle (float radius){
        float AreaOfACircle = (float) Math.PI * (radius * radius);
        return AreaOfACircle;
    }
}

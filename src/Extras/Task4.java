package Extras;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        getStarSinusoid();

    }

    public static void getStarSinusoid() {
        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Prosze podać ile razy ma się powtarzać okres fali");
        int czestotliwosc = scanner.nextInt();
    */
        System.out.println("Prosze podać jak długi ma być szlak");
        int trailLength = scanner.nextInt();
/*            for (int j = 0; j < czestotliwosc; j++){
                System.out.print("*      *");
            }
            System.out.println();
            for (int y = 0; y < czestotliwosc; y++){
                System.out.print(" *    * ");
            }
            System.out.println();
            for (int z = 0; z < czestotliwosc; z++){
                System.out.print("  *  *  ");
            }
            System.out.println();
            for (int y = 0; y < czestotliwosc; y++){
                System.out.print("   **   ");
            }*/

        StringBuilder firstLine = new StringBuilder();
        StringBuilder secondLine = new StringBuilder().append(" ");
        StringBuilder thirdLine = new StringBuilder().append("  ");
        StringBuilder fourthLine = new StringBuilder().append("   ");
        String oneElement = "*    ";
        String twoElement = "    *";

            int number = 1;
        for (int i = 0; i < trailLength; i++){
            switch (number){
                case 1:
                    firstLine.append(oneElement);
                    number = 2;
                    continue;
                case 2:
                    secondLine.append(oneElement);
                    number = 3;
                    continue;
                case 3:
                    thirdLine.append(oneElement);
                    number = 4;
                    continue;
                case 4:
                    fourthLine.append(oneElement);
                    number = 5;
                    continue;
                case 5:
                    fourthLine.append(twoElement);
                    number = 6;
                    continue;
                case 6:
                    thirdLine.append(twoElement);
                    number = 7;
                    continue;
                case 7:
                    secondLine.append(twoElement);
                    number = 8;
                    continue;
                case 8:
                    firstLine.append(twoElement);
                    number = 1;
                    continue;
            }
        }
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
        /*for (int i = 0; i < trailLength; i++) {
            if (trailLength % 8 == 0) { //8,16,24...
                for (int j = 0; j < trailLength; j++) {
                    System.out.print("*      *");
                }
                System.out.println();
                for (int y = 0; y < trailLength; y++) {
                    System.out.print(" *    * ");
                }
                System.out.println();
                for (int z = 0; z < trailLength; z++) {
                    System.out.print("  *  *  ");
                }
                System.out.println();
                for (int y = 0; y < trailLength; y++) {
                    System.out.print("   **   ");
                }
            }

            if (trailLength < 8) { //1,2,3,4,5,6,7
                if (trailLength == 1) {
                    System.out.print("*   ");
                }
                if (trailLength == 2) {
                    System.out.print(" *  ");
                }
                System.out.print("   *");

            }
            if (trailLength >= 8) { //9,16,17,24,25,....
                //tu wydrukuje cały kompletne V i na końcu dodam pare gwiazdek
            }
        }*/
    }
}

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
        StringBuilder secondLine = new StringBuilder();
        StringBuilder thirdLine = new StringBuilder();
        StringBuilder fourthLine = new StringBuilder();
        String starElement = "*";
        String space1Element = " ";
        String space2Element = "  ";
        String space3Element = "   ";
        String space4Element = "    ";

            int number = 1;
        for (int i = 0; i < trailLength; i++){
            switch (number){
                case 1:
                    firstLine.append(starElement).append(space3Element);
                    number = 2;
                    continue;
                case 2:
                    secondLine.append(space1Element).append(starElement).append(space2Element);
                    number = 3;
                    continue;
                case 3:
                    thirdLine.append(space2Element).append(starElement).append(space1Element);
                    number = 4;
                    continue;
                case 4:
                    fourthLine.append(space3Element).append(starElement);
                    number = 5;
                    continue;
                case 5:
                    fourthLine.append(starElement).append(space3Element);
                    number = 6;
                    continue;
                case 6:
                    thirdLine.append(space1Element).append(starElement).append(space2Element);
                    number = 7;
                    continue;
                case 7:
                    secondLine.append(space2Element).append(starElement).append(space1Element);
                    number = 8;
                    continue;
                case 8:
                    firstLine.append(space3Element).append(starElement);
                    number = 1;
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

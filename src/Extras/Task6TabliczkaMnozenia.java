package Extras;

public class Task6TabliczkaMnozenia {
    public static void main(String[] args) {

        tabliczkaMnożenia();
    }
    public static void tabliczkaMnożenia (){
        for (int i = 1; i < 11; i++){
            System.out.println();
            for (int j = 1; j < 11; j++){
                System.out.print( i * j + " ");
            }
        }
    }
}

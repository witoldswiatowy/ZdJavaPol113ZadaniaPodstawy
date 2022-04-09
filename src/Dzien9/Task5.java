package Dzien9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(timer());

    }

    private static LocalTime timer (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pomiar czasu zacznie się po wciśnięciu entera");
        String start = scanner.nextLine();
        LocalTime time1 = LocalTime.MIN;
        if (start.equals("\n")) {
            time1 = LocalTime.now();
        }
        String stop = scanner.nextLine();
        if (stop.equals("\n")) {
            time1 = LocalTime.now();
        }
    return time1;
    }
}

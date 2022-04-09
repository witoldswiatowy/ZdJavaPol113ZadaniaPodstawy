package Dzien9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6prowadzacego {
    public static void main(String[] args) {
        String input = "2022-04-16 13:10:15";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dataTime = LocalDateTime.parse(input, formatter);
        System.out.println(dataTime);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, dataTime);
        long days = duration.toDaysPart();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int secs = duration.toSecondsPart();
        System.out.println("You have Days: " + days + " Hours: " + hours + " Minutes: "+ minutes + " Seconds: " + secs);
        System.out.printf("You have Days: %d Hours: %d Minutes %d Secunds %d", days, hours, minutes, secs);
        System.out.println();
        System.out.printf("You have Days: %02d Hours: %02d Minutes %02d Secunds %02d", days, hours, minutes, secs);
        System.out.printf("\n%02d:%02d:%02d:%02d", days, hours, minutes, secs);
    }

}

import java.util.Scanner;

import javax.print.event.PrintJobListener; 

public class TIme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the number of seconds");
        int hours;
        int minutes;
        int seconds;
        int totalSeconds;
        int totalMinutes;
        String x;
        x = "";


        seconds = s.nextInt();
        minutes = seconds/60;
        hours = minutes/60;


        System.out.println(seconds);
        System.out.println(minutes);
        System.out.println(hours);
        System.out.println(x + seconds);
    }
}

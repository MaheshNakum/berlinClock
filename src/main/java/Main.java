import java.util.Scanner;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String timeEntered;
        System.out.println("Enter a time in the format of HH:MM:ss after the colon");
        System.out.print("Enter time after the colon : ");
        timeEntered = input.next();

        UserInput time = new UserInput(timeEntered);
        time.validateUserInput();
        System.out.println(time.validateUserInput());
        time.convertInputToTime();

        Hour hour = new Hour(time.getHour());
        hour.convertHourFiveHourRow();
        hour.convertHourOneHourRow();

        Minute minute = new Minute(time.getMinute());
        minute.convertMinuteFiveMinuteRow();
        minute.convertMinuteOneMinuteRow();

        Second second = new Second(time.getSecond());
        second.convertSecond();

        DrawClock drawClock = new DrawClock(hour, minute, second);
        drawClock.drawClock();


    } //end of main

} //end of class

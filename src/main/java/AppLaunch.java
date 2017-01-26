import java.util.Scanner;

class AppLaunch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String timeEntered;
        System.out.println("Enter a time in the format of HH:MM:ss after the colon");
        System.out.print("Enter time after the colon : ");
        timeEntered = input.next();

        UserInput time = new UserInput(timeEntered);
        time.validateUserInput();
        time.convertInputToTimeFormat();

        HourLamp hourLamp = new HourLamp(time.getHour());
        hourLamp.convertFiveHourRow();
        hourLamp.convertOneHourRow();

        MinuteLamp minuteLamp = new MinuteLamp(time.getMinute());
        minuteLamp.convertFiveMinuteRow();
        minuteLamp.convertOneMinuteRow();

        SecondLamp secondLamp = new SecondLamp(time.getSecond());

        DrawClock drawClock = new DrawClock(hourLamp, minuteLamp, secondLamp);
        drawClock.drawClock();


    } //end of main

} //end of class

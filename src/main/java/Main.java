/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Main {

    public static void main(String[] args) {

        UserInput time = new UserInput("13:24:09");
        time.convertTimeInputToTime();

        System.out.println("HourSet: " + time.getHour());
        System.out.println("MinuteSet: " + time.getMinute());
        System.out.println("SecondSet: " + time.getSecond());
        System.out.println("----------------------------------------");


        Hour hour = new Hour(time.getHour());
        hour.convertHourFiveRow();
        hour.convertHourOneRow();

        Minute minute = new Minute(time.getMinute());
        minute.minuteConvertFiveMinuteRow();
        minute.minuteConvertOneMinuteRow();

        Second second = new Second(time.getSecond());
        second.convertSecond();

        DrawClock drawClock = new DrawClock(hour, minute, second);
        drawClock.drawClock();


    } //end of main

} //end of class

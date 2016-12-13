import java.util.Arrays;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Main {

    public static void main(String[] args) {

        UserInput time = new UserInput("16:59:59");
        time.convertTimeInputToTime();

        Second second = new Second(time.getSecond());
        second.convertSecond();

        System.out.println("HourSet: " + time.getHour());
        System.out.println("MinuteSet: " + time.getMinute());
        System.out.println("SecondSet: " + time.getSecond());
        System.out.println("----------------------------------------");


        System.out.println("SecondString: " + second.convertSecond());
        System.out.println("----------------------------------------");

        Hour hour = new Hour(time.getHour());
        hour.convertHourFiveRow();
        hour.convertHourOneRow();

        System.out.println("FiveHourRow: " + Arrays.toString(hour.getFiveHourRow()));
        System.out.println("----------------------------------------");
        System.out.println("OneHourRow: " + Arrays.toString(hour.getOneHourRow()));
        System.out.println("----------------------------------------");




    } //end of main

} //end of class

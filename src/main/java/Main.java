/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Main {

    public static void main(String[] args) {

        UserInput time = new UserInput("23:00:01");
        time.convertTimeInputToTime();

        //temp code for sys out

        System.out.println("HourSet: " + time.getHour());
        System.out.println("MinuteSet: " + time.getMinute());
        System.out.println("SecondSet: " + time.getSecond());
        System.out.println("----------------------------------------");

        Second second = new Second(time.getSecond());
        second.convertSecond();
        System.out.println("SecondString: " + second.convertSecond());
        System.out.println("----------------------------------------");


    } //end of main

} //end of class

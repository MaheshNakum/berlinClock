import java.util.Arrays;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class DrawClock {

    private Hour hour;
    private Minute minute;
    private Second second;

    public DrawClock(Hour hour, Minute minute, Second second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void drawClock(){

        System.out.println("SecondString: " + second.convertSecond());
        System.out.println("----------------------------------------");

        System.out.println("FiveHourRow: " + Arrays.toString(hour.getFiveHourRow()));
        System.out.println("----------------------------------------");
        System.out.println("OneHourRow: " + Arrays.toString(hour.getOneHourRow()));
        System.out.println("----------------------------------------");

        System.out.println("FiveMinuteRow: " + Arrays.toString(minute.getFiveMinuteRow()));
        System.out.println("----------------------------------------");

        System.out.println("OneMinuteRow: " + Arrays.toString(minute.getOneMinuteRow()));
        System.out.println("----------------------------------------");

    }

}

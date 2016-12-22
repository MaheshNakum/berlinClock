import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class UserInput {

    public UserInput (String userTimeInput){

        this.userTimeInput = userTimeInput;

    }

    private String userTimeInput;
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    private void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    private void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    private void setSecond(int second) {
        this.second = second;
    }

    public boolean validateUserInput(){

        String[] inputArray = userTimeInput.split(":");

        int h = Integer.parseInt(inputArray[0]);
        int m = Integer.parseInt(inputArray[1]);
        int s = Integer.parseInt(inputArray[2]);


        if ((h < 0 || h > 23) || (m < 0 || m > 59) || (s < 0 || s > 59)){
            throw new IllegalArgumentException("Not a valid input of Time!");

        }
        return true;
    }

    public void convertInputToTime(){

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(userTimeInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date

        setHour(calendar.get(Calendar.HOUR_OF_DAY));
        setMinute(calendar.get(Calendar.MINUTE));
        setSecond(calendar.get(Calendar.SECOND));

    } //end of method


} //end of class

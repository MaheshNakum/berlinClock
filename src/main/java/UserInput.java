import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class UserInput {

    public UserInput (String userTimeInput){

        this.userTimeInput = userTimeInput;

    }

    private final String userTimeInput;
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

        String[] TimeArray = userTimeInput.split(":");

        int hour = Integer.parseInt(TimeArray[0]);
        int minute = Integer.parseInt(TimeArray[1]);
        int second = Integer.parseInt(TimeArray[2]);


        if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59) || (second < 0 || second > 59)){
            throw new IllegalArgumentException("Not a valid input of Time!");

        }
        return true;
    }

    public void convertInputToTimeFormat(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(userTimeInput);
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

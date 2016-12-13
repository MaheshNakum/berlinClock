import java.util.Arrays;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Hour {

    private int hour;
    private String[] fiveHourRow = new String[] {"O", "O", "O", "O"};
    private String[] oneHourRow = new String[] {"O", "O", "O", "O"};

    public Hour (int hour){
        this.hour = hour;
    }

    public void convertHour(){

        int fiveHourHour = hour;
        int fiveHourCounter = 0;

        for (String e : fiveHourRow){

            if (fiveHourHour >=5){
                fiveHourRow[fiveHourCounter] = "R";
                fiveHourCounter++;
                fiveHourHour = fiveHourHour - 5;
            } //end of if
        } // end of loop

        System.out.println("fiveHourRow: " + Arrays.toString(fiveHourRow));  // to be removed

        int oneHourHour = hour % 5;
        int oneHourCounter = 0;

        for (String e : oneHourRow){
            if (oneHourHour > 0){
                oneHourRow[oneHourCounter] = "R";
                oneHourCounter++;
                oneHourHour--;
            } //end of if
        } //end of loop

        System.out.println("oneHourRow: " + Arrays.toString(oneHourRow)); //to be removed
        System.out.println("----------------------------------------");

    } //end of method

} //end of class

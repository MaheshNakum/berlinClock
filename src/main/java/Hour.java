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

    public String[] getFiveHourRow() {
        return fiveHourRow;
    }


    public String[] getOneHourRow() {
        return oneHourRow;
    }

    public String[] convertHourFiveHourRow() {

        int fiveHourHour = hour;

        for (int i=0;i<fiveHourRow.length;i++){
            if (fiveHourHour >= 5) {
                fiveHourRow[i] = "R";
                fiveHourHour = fiveHourHour - 5;
            } //end of if
        } //end of loop

        return fiveHourRow;

    } // close of method

    public String[] convertHourOneHourRow(){

        int oneHourHour = hour % 5;
        //int oneHourCounter = 0;

        for (int i=0;i<oneHourRow.length;i++){
            if (oneHourHour > 0){
                oneHourRow[i] = "R";
                oneHourHour--;
               } //end of if
        } // end of loop

        return oneHourRow;

    } //end of method

} //end of class

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class Minute {

    private int minute;
    private String fiveMinuteRow[] = new String[] {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};
    private String oneMinuteRow[] = new String[] {"O", "O", "O", "O"};
    public Minute (int minute) {
        this.minute = minute;
    }

    public String[] getFiveMinuteRow() {
        return fiveMinuteRow;
    }

    public String[] getOneMinuteRow() {
        return oneMinuteRow;
    }

    public String[] convertMinuteFiveMinuteRow(){

        int fiveMinuteMinute = minute;
        int counter = 5;

        for (int i = 0;i<fiveMinuteRow.length;i++){
            if (counter<=fiveMinuteMinute){
                fiveMinuteRow[i] = "Y";
                if (counter == 15 || counter == 30 || counter == 45){
                    fiveMinuteRow[i] = "R";
                } // end if
            } //end if
            counter = counter + 5;
        } //end for
        return fiveMinuteRow;
    } //end method

    public String[] convertMinuteOneMinuteRow(){

        int oneMinuteMinute = minute % 5;

        for (int i = 0;i<oneMinuteRow.length;i++){
            if (oneMinuteMinute>0){
                oneMinuteRow[i] = "Y";
            }
            oneMinuteMinute--;
        } //end loop

        return oneMinuteRow;
    }
}

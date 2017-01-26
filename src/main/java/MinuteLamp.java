class MinuteLamp {

    private static final String MINUTE_LAMP_OFF = "O";
    private static final String MINUTE_LAMP_ON = "Y";
    private static final String QUARTER_MINUTE_LAMP_ON = "R";

    private static final int FIVE_MINUTES = 5;
    private static final int QUARTER_PAST = 15;
    private static final int HALF_PAST = 30;
    private static final int QUARTER_TO = 45;

    private final int minute;

    private final String[] fiveMinuteRow = new String[] {MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF};
    private final String[] oneMinuteRow = new String[] {MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF, MINUTE_LAMP_OFF};

    public MinuteLamp(int minute) {
        this.minute = minute;
    }

    public String[] getFiveMinuteRow() {
        return fiveMinuteRow;
    }

    public String[] getOneMinuteRow() {
        return oneMinuteRow;
    }

    public String[] convertFiveMinuteRow(){

        int fiveMinute = minute;
        int counter = FIVE_MINUTES;

        for (int i = 0;i<fiveMinuteRow.length;i++){
            if (counter<=fiveMinute){
                fiveMinuteRow[i] = MINUTE_LAMP_ON;
                if (counter == QUARTER_PAST || counter == HALF_PAST || counter == QUARTER_TO){
                    fiveMinuteRow[i] = QUARTER_MINUTE_LAMP_ON;
                } // end if
            } //end if
            counter = counter + FIVE_MINUTES;
        } //end for
        return fiveMinuteRow;
    } //end method

    public String[] convertOneMinuteRow(){

        int oneMinute = minute % FIVE_MINUTES;

        for (int i = 0;i<oneMinuteRow.length;i++){
            if (oneMinute>0){
                oneMinuteRow[i] = MINUTE_LAMP_ON;
            }
            oneMinute--;
        } //end loop

        return oneMinuteRow;
    }
}

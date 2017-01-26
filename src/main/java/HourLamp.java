class HourLamp {

    private static final int FIVE_HOURS = 5;
    private static final String HOUR_LAMP_ON = "R";
    private static final String HOUR_LAMP_OFF = "O";

    private final int hour;
    private final String[] fiveHourRow = new String[]{HOUR_LAMP_OFF, HOUR_LAMP_OFF, HOUR_LAMP_OFF, HOUR_LAMP_OFF};
    private final String[] oneHourRow = new String[]{HOUR_LAMP_OFF, HOUR_LAMP_OFF, HOUR_LAMP_OFF, HOUR_LAMP_OFF};

    public HourLamp(int hour) {
        this.hour = hour;
    }

    public String[] getFiveHourRow() {
        return fiveHourRow;
    }

    public String[] getOneHourRow() {
        return oneHourRow;
    }

    public String[] convertFiveHourRow() {

        int fiveHourHour = hour;

        for (int i = 0; i < fiveHourRow.length; i++) {
            if (fiveHourHour >= FIVE_HOURS) {
                fiveHourRow[i] = HOUR_LAMP_ON;
                fiveHourHour = fiveHourHour - FIVE_HOURS;
            } //end of if
        } //end of loop

        return fiveHourRow;

    } // close of method

    public String[] convertOneHourRow() {

        int oneHourHour = hour % 5;

        for (int i = 0; i < oneHourRow.length; i++) {
            if (oneHourHour > 0) {
                oneHourRow[i] = HOUR_LAMP_ON;
                oneHourHour--;
            } //end of if
        } // end of loop

        return oneHourRow;

    } //end of method

} //end of class

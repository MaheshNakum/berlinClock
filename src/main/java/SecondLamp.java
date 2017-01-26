class SecondLamp {

    private static final String SECOND_LAMP_ON = "Y";
    private static final String SECOND_LAMP_OFF = "O";

    private final int second;

    public SecondLamp(int second){
        this.second = second;
    }

    public String getSecond() {
        return convertSecond();
    }

    private String convertSecond(){
        if (second % 2 == 0){
            return SECOND_LAMP_ON;
        }
        return SECOND_LAMP_OFF;
    }
}

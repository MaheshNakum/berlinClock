class DrawClock {

    private final HourLamp hourLamp;
    private final MinuteLamp minuteLamp;
    private final SecondLamp secondLamp;


    public DrawClock(HourLamp hourLamp, MinuteLamp minuteLamp, SecondLamp secondLamp) {
        this.hourLamp = hourLamp;
        this.minuteLamp = minuteLamp;
        this.secondLamp = secondLamp;
    }

    public void drawClock() {
        System.out.println("                *   *  ");
        System.out.println("               *     * ");
        System.out.println("              *   " + secondLamp.getSecond() + "   *");
        System.out.println("               *     * ");
        System.out.println("                *   *  ");

        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + hourLamp.getFiveHourRow()[0] + "   ║║   " + hourLamp.getFiveHourRow()[1] + "   ║║   " + hourLamp.getFiveHourRow()[2] + "   ║║   " + hourLamp.getFiveHourRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");
        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + hourLamp.getOneHourRow()[0] + "   ║║   " + hourLamp.getOneHourRow()[1] + "   ║║   " + hourLamp.getOneHourRow()[2] + "   ║║   " + hourLamp.getOneHourRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");
        System.out.println("╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗");
        System.out.println("║" + minuteLamp.getFiveMinuteRow()[0] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[1] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[2] + "║" + " ║"
                + minuteLamp.getFiveMinuteRow()[3] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[4] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[5] + "║" + " ║"
                + minuteLamp.getFiveMinuteRow()[6] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[7] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[8] + "║" + " ║"
                + minuteLamp.getFiveMinuteRow()[9] + "║" + "║"
                + minuteLamp.getFiveMinuteRow()[10] + "║");
        System.out.println("╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝");
        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + minuteLamp.getOneMinuteRow()[0] + "   ║║   " + minuteLamp.getOneMinuteRow()[1] + "   ║║   " + minuteLamp.getOneMinuteRow()[2] + "   ║║   " + minuteLamp.getOneMinuteRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");




        /*System.out.println("SecondString: " + secondLamp.convertSecond());
        System.out.println("----------------------------------------");

        System.out.println("FiveHourRow: " + Arrays.toString(hourLamp.getFiveHourRow()));
        System.out.println("----------------------------------------");
        System.out.println("OneHourRow: " + Arrays.toString(hourLamp.getOneHourRow()));
        System.out.println("----------------------------------------");

        System.out.println("FiveMinuteRow: " + Arrays.toString(minuteLamp.getFiveMinuteRow()));
        System.out.println("----------------------------------------");

        System.out.println("OneMinuteRow: " + Arrays.toString(minuteLamp.getOneMinuteRow()));
        System.out.println("----------------------------------------");*/


    }
}

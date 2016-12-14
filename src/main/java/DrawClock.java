/**
 * Created by maheshnakum on 13/12/2016.
 */
public class DrawClock {

    private Hour hour;
    private Minute minute;
    private Second second;

    public DrawClock(Hour hour, Minute minute, Second second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void drawClock() {

        /*System.out.println("SecondString: " + second.convertSecond());
        System.out.println("----------------------------------------");

        System.out.println("FiveHourRow: " + Arrays.toString(hour.getFiveHourRow()));
        System.out.println("----------------------------------------");
        System.out.println("OneHourRow: " + Arrays.toString(hour.getOneHourRow()));
        System.out.println("----------------------------------------");

        System.out.println("FiveMinuteRow: " + Arrays.toString(minute.getFiveMinuteRow()));
        System.out.println("----------------------------------------");

        System.out.println("OneMinuteRow: " + Arrays.toString(minute.getOneMinuteRow()));
        System.out.println("----------------------------------------");*/


        System.out.println("                *   *  ");
        System.out.println("               *     * ");
        System.out.println("              *   " + second.convertSecond() + "   *");
        System.out.println("               *     * ");
        System.out.println("                *   *  ");

        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + hour.getFiveHourRow()[0] + "   ║║   " + hour.getFiveHourRow()[1] + "   ║║   " + hour.getFiveHourRow()[2] + "   ║║   " + hour.getFiveHourRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");
        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + hour.getOneHourRow()[0] + "   ║║   " + hour.getOneHourRow()[1] + "   ║║   " + hour.getOneHourRow()[2] + "   ║║   " + hour.getOneHourRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");
        System.out.println("╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗");
        System.out.println("║" + minute.getFiveMinuteRow()[0] + "║" + "║"
                +minute.getFiveMinuteRow()[1]+ "║"+"║"
                +minute.getFiveMinuteRow()[2]+ "║"+" ║"
                +minute.getFiveMinuteRow()[3]+ "║"+"║"
                +minute.getFiveMinuteRow()[4]+ "║"+"║"
                +minute.getFiveMinuteRow()[5]+ "║"+" ║"
                +minute.getFiveMinuteRow()[6]+ "║"+"║"
                +minute.getFiveMinuteRow()[7]+ "║"+"║"
                +minute.getFiveMinuteRow()[8]+ "║"+" ║"
                +minute.getFiveMinuteRow()[9]+ "║"+"║"
                +minute.getFiveMinuteRow()[10]+ "║");
        System.out.println("╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝");
        System.out.println("╔═══════╗╔═══════╗╔═══════╗╔═══════╗");
        System.out.println("║   " + minute.getOneMinuteRow()[0] + "   ║║   " + minute.getOneMinuteRow()[1] + "   ║║   " + minute.getOneMinuteRow()[2] + "   ║║   " + minute.getOneMinuteRow()[3] + "   ║");
        System.out.println("╚═══════╝╚═══════╝╚═══════╝╚═══════╝");


    }
}

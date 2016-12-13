import org.junit.Test;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class HourTest {

    @Test
    public void convertHourFiveHourRow() throws Exception {

        String[] fiveHourRow = new String[] {"O", "O", "O", "O"};

        int hour = 17;

        Hour hour1 = new Hour(hour);
        hour1.convertHour();
        String[] fiveHourRowManualOutput = new String[] {"R", "R", "R", "O"};
        





    }

}
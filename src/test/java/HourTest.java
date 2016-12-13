import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class HourTest {

    private int hour = 17;
    private Hour hour1 = new Hour(hour);

    @Test
    public void convertHourFiveRow() throws Exception {

        hour1.convertHourFiveHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "R", "O"};

        Assert.assertArrayEquals(ExpectedOutcome, hour1.getFiveHourRow());

    }

    @Test
    public void convertHourOneRow() throws Exception {

        hour1.convertHourOneHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "O", "O"};

        Assert.assertArrayEquals(ExpectedOutcome, hour1.getOneHourRow());
    }
}
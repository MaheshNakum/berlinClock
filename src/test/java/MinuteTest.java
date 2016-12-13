import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class MinuteTest {

    private int minute = 17;
    private Minute minute1 = new Minute(minute);

    @Test
    public void minuteConvertFiveMinuteRow() throws Exception {

        minute1.convertMinuteFiveMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "R", "O", "O", "O", "O", "O", "O", "O", "O"};

        Assert.assertArrayEquals(expectedOutcome, minute1.getFiveMinuteRow());

    }

    @Test
    public void minuteConvertOneMinuteRow() throws Exception {

        minute1.convertMinuteOneMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "O", "O"};

        Assert.assertArrayEquals(expectedOutcome, minute1.getOneMinuteRow());


    }

}
import org.junit.Test;

import static org.hamcrest.Matchers.arrayContaining;
import static org.junit.Assert.assertThat;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class MinuteTest {

    private int setMinute = 17;
    private Minute minute = new Minute(setMinute);

    @Test
    public void minuteConvertFiveMinuteRow() throws Exception {

        String[] actualOutcome = minute.convertMinuteFiveMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "R", "O", "O", "O", "O", "O", "O", "O", "O"};

        assertThat(actualOutcome, arrayContaining(expectedOutcome));

    }

    @Test
    public void minuteConvertOneMinuteRow() throws Exception {

        String[] actualOutcome = minute.convertMinuteOneMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "O", "O"};

        assertThat(actualOutcome, arrayContaining(expectedOutcome));

    }

}
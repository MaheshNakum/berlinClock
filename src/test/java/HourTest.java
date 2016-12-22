import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class HourTest {

    private int setHour = 17;
    private Hour hour = new Hour(setHour);

    @Test
    public void convertHourFiveRow() throws Exception {

        String[] ActualOutcome = hour.convertHourFiveHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "R", "O"};

        assertThat(ActualOutcome, arrayContaining(ExpectedOutcome));


    }

    @Test
    public void convertHourOneRow() throws Exception {

        String[] ActualOutcome = hour.convertHourOneHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "O", "O"};

        assertThat(ActualOutcome, arrayContaining(ExpectedOutcome));

    }
}
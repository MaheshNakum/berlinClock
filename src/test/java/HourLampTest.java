import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class HourLampTest {

    private final int setHour = 17;
    private final HourLamp hourLamp = new HourLamp(setHour);

    @Test
    public void convertHourFiveRow() throws Exception {

        String[] ActualOutcome = hourLamp.convertFiveHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "R", "O"};

        assertThat(ActualOutcome, arrayContaining(ExpectedOutcome));


    }

    @Test
    public void convertHourOneRow() throws Exception {

        String[] ActualOutcome = hourLamp.convertOneHourRow();

        String[] ExpectedOutcome = new String[]{"R", "R", "O", "O"};

        assertThat(ActualOutcome, arrayContaining(ExpectedOutcome));

    }
}
import org.junit.Test;

import static org.hamcrest.Matchers.arrayContaining;
import static org.junit.Assert.assertThat;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class MinuteLampTest {

    private final int setMinute = 17;
    private final MinuteLamp minuteLamp = new MinuteLamp(setMinute);

    @Test
    public void minuteConvertFiveMinuteRow() throws Exception {

        String[] actualOutcome = minuteLamp.convertFiveMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "R", "O", "O", "O", "O", "O", "O", "O", "O"};

        assertThat(actualOutcome, arrayContaining(expectedOutcome));

    }

    @Test
    public void minuteConvertOneMinuteRow() throws Exception {

        String[] actualOutcome = minuteLamp.convertOneMinuteRow();

        String[] expectedOutcome = new String[]{"Y", "Y", "O", "O"};

        assertThat(actualOutcome, arrayContaining(expectedOutcome));

    }

}
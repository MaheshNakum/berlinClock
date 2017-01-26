import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by maheshnakum on 13/12/2016.
 */

public class SecondLampTest {

    @Test
    public void convertSecond() throws Exception {

        int setSecond = 10;
        SecondLamp secondLamp = new SecondLamp(setSecond);

        String expectedOutcome = "Y";
        String actualOutcome = secondLamp.getSecond();

        assertThat(actualOutcome, is(expectedOutcome));

    }

}
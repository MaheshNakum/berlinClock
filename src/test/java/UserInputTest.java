import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by maheshnakum on 20/12/2016.
 */
public class UserInputTest {
    @Test
    public void validateUserInput() throws Exception {

        UserInput time = new UserInput("10:30:23");
        Boolean actualOutcome = time.validateUserInput();

        assertThat(actualOutcome, is(true));

    }

    @Test
    public void convertInputToTime() throws Exception {

        UserInput time = new UserInput("10:30:23");
        time.convertInputToTime();

        int actualHour = time.getHour();
        int actualMinute = time.getMinute();
        int actualSecond = time.getSecond();



        assertThat(actualSecond, is(23));
        assertThat(actualMinute, is(30));
        assertThat(actualHour, is(10));
    }

}
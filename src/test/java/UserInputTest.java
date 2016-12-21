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

        assertThat(time.validateUserInput(), is(true));

    }

    @Test
    public void convertInputToTime() throws Exception {

        UserInput time = new UserInput("10:30:23");
        time.convertInputToTime();

        assertThat(time.getSecond(), is(23));
        assertThat(time.getMinute(), is(30));
        assertThat(time.getHour(), is(10));
    }

}
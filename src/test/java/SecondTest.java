import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class SecondTest {

    @Test
    public void convertSecond() throws Exception {

        int second1 = 10;
        String result = "Y";

        Second second = new Second(second1);

        //Assert.assertEquals("Y", second.convertSecond());
        assertThat(second.convertSecond(), is(result));

    }

}
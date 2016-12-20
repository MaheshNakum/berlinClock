import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maheshnakum on 13/12/2016.
 */
public class SecondTest {

    @Test
    public void convertSecond() throws Exception {

        int second1 = 10;

        Second second = new Second(second1);


        Assert.assertEquals("Y", second.convertSecond());

    }

}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilkayaktas on 2018-12-16 at 01:32.
 */
public class FraudulentActivityNotificationsTest {

    @Test
    public void activityNotifications() {
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        // 1026


    }

    @Test
    public void median(){
//        assertEquals(30, FraudulentActivityNotifications.median(Arrays.asList(10,20,30,40,50)));
//        assertEquals(25, FraudulentActivityNotifications.median(Arrays.asList(10,50,25,40,20)));
//        assertEquals(35, FraudulentActivityNotifications.median(Arrays.asList(10,20,30,40,50,60)));
    }
}
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilkayaktas on 2018-12-16 at 01:32.
 */
public class FraudulentActivityNotificationsTest {

    @Test
    public void activityNotifications() {
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        // 1026


    }

    @Test
    public void median(){
//        assertEquals(30, FraudulentActivityNotifications.median(Arrays.asList(10,20,30,40,50)));
//        assertEquals(25, FraudulentActivityNotifications.median(Arrays.asList(10,50,25,40,20)));
//        assertEquals(35, FraudulentActivityNotifications.median(Arrays.asList(10,20,30,40,50,60)));

        Comparator<Integer> comparator = new PriceComparator();
        PriorityQueue<Integer> queue =
                new PriorityQueue<>(10, comparator);
        queue.add(23);
        queue.add(12);
        queue.add(1007);
        queue.add(100);
        queue.add(1001);
        queue.add(1002);
        queue.add(10031);
        queue.add(1004);
        queue.add(1005);
        queue.add(1007);
        queue.add(1009);
        queue.add(1012);
        queue.add(1018);
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }

     /*   Integer[] arr = queue.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("_"+arr[i]);
        }*/
    }
}
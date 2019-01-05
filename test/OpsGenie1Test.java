import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-23 at 14:23.
 */
public class OpsGenie1Test {

    @Test
    public void maxDifference() {
//        assertEquals(5, OpsGenie1.maxDifference(new int[]{1,2,6,4}));
//        assertEquals(8, OpsGenie1.maxDifference(new int[]{2,3,10,2,4,8,1}));
        assertEquals(-1, OpsGenie1.maxDifference(new int[]{10, 8,7,6,5}));
    }
}
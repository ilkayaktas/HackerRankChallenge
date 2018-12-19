import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-18 at 21:22.
 */
public class MinimumTimeRequiredTest {

    @Test
    public void minTime() {
        assertEquals(6, MinimumTimeRequired.minTime(new long[]{2,3}, 5));
        assertEquals(7, MinimumTimeRequired.minTime(new long[]{1,3,4}, 10));
        assertEquals(20, MinimumTimeRequired.minTime(new long[]{4,5,6}, 12));
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aselsan on 20.12.2018 at 17:30.
 */
public class MinimumAbsoluteDifferenceInAnArrayTest {

    @Test
    public void minimumAbsoluteDifference() {
        assertEquals(1, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}));
        assertEquals(3, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(new int[]{3, -7, 0}));
        assertEquals(3, MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}));
    }
}
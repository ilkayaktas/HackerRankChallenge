import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 20.12.2018 at 09:53.
 */
public class MinimumDistancesTest {

    @Test
    public void minimumDistances() {
        assertEquals(3, MinimumDistances.minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
        assertEquals(2, MinimumDistances.minimumDistances(new int[]{3, 2, 1, 2, 3}));
    }
}
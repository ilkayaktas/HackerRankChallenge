import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-15 at 14:31.
 */
public class NewYearChaosTest {

    @Test
    public void minimumBribes() {
        NewYearChaos.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
        NewYearChaos.minimumBribes(new int[]{2, 1, 5, 3, 4});
        NewYearChaos.minimumBribes(new int[]{2, 5, 1, 3, 4});
    }


}
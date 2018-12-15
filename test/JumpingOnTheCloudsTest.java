import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aselsan on 12.12.2018 at 16:14.
 */
public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnClouds() {
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}));
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}
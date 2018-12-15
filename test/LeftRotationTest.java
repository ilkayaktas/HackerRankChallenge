import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-15 at 14:05.
 */
public class LeftRotationTest {

    @Test
    public void rotLeft() {
        int [] arr = new int[]{1,2,3,4,5};
        assertArrayEquals(new int[]{5,1,2,3,4}, LeftRotation.rotLeft(arr, 4));
    }
}
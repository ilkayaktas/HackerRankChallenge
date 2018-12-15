import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-15 at 21:43.
 */
public class MarkAndToysTest {

    @Test
    public void maximumToys() {
//        MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50);
        assertEquals(4, MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }
}
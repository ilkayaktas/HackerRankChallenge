import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 18.12.2018 at 16:53.
 */
public class PairsTest {

    @Test
    public void pairs() {
        assertEquals(3, Pairs.pairs(2, new int[]{1, 5, 3, 4, 2}));
        assertEquals(3, Pairs.pairs(1, new int[]{1, 2, 3, 4}));
    }
}
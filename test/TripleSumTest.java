import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 18.12.2018 at 17:12.
 */
public class TripleSumTest {

    @Test
    public void triplets() {
        assertEquals(8, TripleSum.triplets(
                new int[]{1, 3, 5, 3},
                new int[]{2, 3},
                new int[]{1, 2, 3}
        ));
        assertEquals(5, TripleSum.triplets(
                new int[]{1, 4, 5},
                new int[]{2, 3, 3},
                new int[]{1, 2, 3}
        ));
        assertEquals(12, TripleSum.triplets(
                new int[]{1, 3, 5, 7},
                new int[]{5, 7, 9},
                new int[]{7, 9, 11, 13}
        ));
        assertEquals(0, TripleSum.triplets(
                new int[]{5, 7, 9},
                new int[]{1, 1, 1},
                new int[]{5, 7, 9}
        ));
    }
}
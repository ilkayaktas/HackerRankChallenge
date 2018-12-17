import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 17.12.2018 at 11:08.
 */
public class Java1DArrayTest {

    @Test
    public void canWin() {

        assertTrue(Java1DArray.canWin(5, new int[]{0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1}));

        assertTrue(Java1DArray.canWin(3, new int[]{0, 0, 0, 0, 0}));
        assertTrue(Java1DArray.canWin(5, new int[]{0, 0, 0, 1, 1, 1}));
        assertFalse(Java1DArray.canWin(3, new int[]{0, 0, 1, 1, 1, 0}));
  //      assertFalse(Java1DArray.canWin(1, new int[]{0, 1, 0}));

  //      assertTrue(Java1DArray.canWin(5, new int[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1}));
  //      assertTrue(Java1DArray.canWin(5, new int[]{0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}));
  //      assertFalse(Java1DArray.canWin(5, new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1}));
    }
}


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-17 at 18:11.
 */
public class DiagonalMatrixTest {

    @Test
    public void diagonalDifference() {
        assertEquals(15, DiagonalMatrix.diagonalDifference(new int[][]{
                new int[]{11, 2, 4},
                new int[]{4, 5, 6},
                new int[]{10, 8, -12},
        }));

        assertEquals(2, DiagonalMatrix.diagonalDifference(new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{9, 8, 9},
        }));
    }
}
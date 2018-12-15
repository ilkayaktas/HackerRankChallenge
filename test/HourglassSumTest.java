import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-15 at 13:27.
 */
public class HourglassSumTest {

    @Test
    public void hourglassSum() {
        int [][] arr = new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };

        assertEquals(19, HourglassSum.hourglassSum(arr));

        int [][] arr2 = new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0}
        };

        assertEquals(10, HourglassSum.hourglassSum(arr2));

        int [][] arr3 = new int[][]{
            {-1,-1,0,-9,-2,-2},
            {-2,-1,-6,-8,-2,-5},
            {-1,-1,-1,-2,-3,-4},
            {-1,-9,-2,-4,-4,-5},
            {-7,-3,-3,-2,-9,-9},
            {-1,-3,-1,-2,-4,-5}
        };

        assertEquals(-6, HourglassSum.hourglassSum(arr3));
    }
}
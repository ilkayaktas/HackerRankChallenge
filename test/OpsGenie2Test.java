import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-23 at 14:49.
 */
public class OpsGenie2Test {

    @Test
    public void oddDigitPrime() {
    }

    @Test
    public void test1(){
        assertFalse(OpsGenie2.isEachOfDigitsOdd(123233));
        assertTrue(OpsGenie2.isEachOfDigitsOdd(11111));
    }
}
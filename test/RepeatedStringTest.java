import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-15 at 12:58.
 */
public class RepeatedStringTest {

    @Test
    public void repeatedString() {
        assertEquals(4, RepeatedString.repeatedString("abcac", 10));
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }
}
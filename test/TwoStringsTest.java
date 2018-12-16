import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-16 at 19:22.
 */
public class TwoStringsTest {

    @Test
    public void twoStrings() {
        assertEquals("YES", TwoStrings.twoStrings("hello", "world"));
        assertEquals("NO", TwoStrings.twoStrings("hi", "world"));
    }
}
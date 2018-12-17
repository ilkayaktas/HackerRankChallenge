import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-17 at 23:38.
 */
public class CommonChildTest {

    @Test
    public void commonChild() {
        assertEquals(2, CommonChild.commonChild("ABCDEF", "FBDAMN"));
        assertEquals(4, CommonChild.commonChild("AGGTAB", "GXTXAYB"));
    }
}
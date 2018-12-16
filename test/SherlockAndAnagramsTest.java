import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-16 at 19:43.
 */
public class SherlockAndAnagramsTest {

    @Test
    public void sherlockAndAnagrams() {
        assertEquals(4, SherlockAndAnagrams.sherlockAndAnagrams("abba"));
        assertEquals(0, SherlockAndAnagrams.sherlockAndAnagrams("abcd"));
        assertEquals(3, SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"));
        assertEquals(10, SherlockAndAnagrams.sherlockAndAnagrams("kkkk"));
    }
}
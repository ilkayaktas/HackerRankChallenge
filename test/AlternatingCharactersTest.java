import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-17 at 19:25.
 */
public class AlternatingCharactersTest {

    @Test
    public void alternatingCharacters() {
        assertEquals(2,AlternatingCharacters.alternatingCharacters("AABAAB"));
        assertEquals(3,AlternatingCharacters.alternatingCharacters("AAAA"));
        assertEquals(4,AlternatingCharacters.alternatingCharacters("BBBBB"));
        assertEquals(0,AlternatingCharacters.alternatingCharacters("ABABABAB"));
        assertEquals(0,AlternatingCharacters.alternatingCharacters("BABABA"));
        assertEquals(4,AlternatingCharacters.alternatingCharacters("AAABBB"));
    }
}
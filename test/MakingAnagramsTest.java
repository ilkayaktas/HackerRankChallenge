import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-17 at 18:56.
 */
public class MakingAnagramsTest {

    @Test
    public void makeAnagram() {
        assertEquals(4, MakingAnagrams.makeAnagram("cde","abc"));
        assertEquals(2, MakingAnagrams.makeAnagram("cde","dcf"));
        assertEquals(2, MakingAnagrams.makeAnagram("abc","abcde"));
        assertEquals(30, MakingAnagrams.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
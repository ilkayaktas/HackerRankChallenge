import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-16 at 19:04.
 */
public class RansomNoteTest {

    @Test
    public void checkMagazine() {
        RansomNote.checkMagazine(new String[]{"ive", "got", "a","lovely", "bunch", "of", "coconuts"},
                                new String[]{"ive", "got", "some", "coconuts"});
    }
}
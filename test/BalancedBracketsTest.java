import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-18 at 21:34.
 */
public class BalancedBracketsTest {

    @Test
    public void isBalanced() {
        assertEquals("YES",BalancedBrackets.isBalanced("{[()]}"));
        assertEquals("NO",BalancedBrackets.isBalanced("{[(])}"));
        assertEquals("YES",BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }
}
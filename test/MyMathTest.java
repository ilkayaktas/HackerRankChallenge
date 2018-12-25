import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aselsan on 25.12.2018 at 11:41.
 */
public class MyMathTest {

    @Test
    public void isPalindrome() {
        MyMath ob = new MyMath();
        assertTrue(MyMath.checker(ob.isPalindrome(), 898));
        assertFalse(MyMath.checker(ob.isPalindrome(), 798));
    }
}
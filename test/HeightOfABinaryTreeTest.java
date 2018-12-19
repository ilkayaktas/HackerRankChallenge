import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-19 at 21:51.
 */
public class HeightOfABinaryTreeTest {

    @Test
    public void height() {
        int [] arr = new int[]{15};
        int t = arr.length;
        Node root = null;
        while(t-- > 0) {
            int data = arr[t];
            root = HeightOfABinaryTree.insert(root, data);
        }

        assertEquals(0, HeightOfABinaryTree.height(root));
    }
}
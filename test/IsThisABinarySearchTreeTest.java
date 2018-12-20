import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ilkayaktas on 2018-12-20 at 00:04.
 */
public class IsThisABinarySearchTreeTest {

    @Test
    public void checkBST() {

        int [] arr = new int[]{10, 11, 3, 8, 6, 7};
        int t = arr.length;
        Node root = null;
        while(t-- > 0) {
            int data = arr[t];
            root = HeightOfABinaryTree.insert(root, data);
        }

        assertTrue(IsThisABinarySearchTree.checkBST(root));
    }
}
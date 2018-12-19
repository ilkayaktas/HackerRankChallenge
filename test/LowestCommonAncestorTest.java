import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilkayaktas on 2018-12-19 at 22:02.
 */
public class LowestCommonAncestorTest {

    @Test
    public void lca() {
        int [] arr = new int[]{6,7,1,3,2,4};
        int t = arr.length;
        Node root = null;
        while(t-- > 0) {
            int data = arr[t];
            root = HeightOfABinaryTree.insert(root, data);
        }

        Node r = LowestCommonAncestor.lca(root, 1, 7);

        System.out.println(r.data);
    }
}
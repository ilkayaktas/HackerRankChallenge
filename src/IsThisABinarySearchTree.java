/**
 * Created by ilkayaktas on 2018-12-19 at 23:54.
 */

public class IsThisABinarySearchTree {
    static boolean checkBST(Node root) {
        return chck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean chck(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if( root.data >= min || root.data <= max ){
            return true;
        }

        return chck(root.left, min, root.data) && chck(root.right, root.data, max);
    }
}

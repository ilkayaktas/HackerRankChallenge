/**
 * Created by ilkayaktas on 2018-12-19 at 22:01.
 */

public class LowestCommonAncestor {

    static boolean fnd = false;
    public static Node lca(Node root, int v1, int v2) {
        if(root == null || isBetween(root.data, v1, v2)){
            return root;
        }

        if(v1 > root.data){
            return lca(root.right, v1, v2);
        } else{
            return lca(root.left, v1, v2);
        }

    }

    private static boolean isBetween(int data, int v1, int v2 ){
        return v1>v2? v1>=data && data>=v2: v2>=data && data>=v1;
    }

}

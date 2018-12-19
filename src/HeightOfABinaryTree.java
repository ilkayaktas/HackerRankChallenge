/**
 * Created by ilkayaktas on 2018-12-19 at 21:50.
 */

public class HeightOfABinaryTree {
    public static int height(Node root) {
        return calc(root, 0);
    }

    private static int calc(Node root, int i){
        if(root == null)return i-1;
        int leftDepth = calc(root.left, i+1);
        int rightDepth = calc(root.right, i+1);
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
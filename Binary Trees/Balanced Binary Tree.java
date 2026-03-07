  import java.util.*;
/*
class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/
class BinaryTree {
    
    public int height(Node root) {
        if (root == null) return 0;  
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean balanced(Node root) {
        if (root == null) return true;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = Math.abs(leftHeight - rightHeight);

        if (diff > 1) return false;
        
        boolean leftBalanced = balanced(root.left);
        boolean rightBalanced = balanced(root.right);

        return leftBalanced && rightBalanced;
    }
    /*
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        BinaryTree b = new BinaryTree();
        if(b.balanced(root)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    */
}

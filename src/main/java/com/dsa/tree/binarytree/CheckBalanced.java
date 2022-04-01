package com.dsa.tree.binarytree;

public class CheckBalanced {

    public static void main(String[] args) {
        System.out.println("Check balanced");
        Node root= new Node(1);

        
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        boolean check= isBalanced(root);
        

        System.out.println(check);
    }

    private static boolean isBalanced(Node root) {

        if(root == null) return true;

        int lh = heightOf(root.left);
        int rh = heightOf(root.right);

        if( (lh-rh) <=1 && isBalanced(root.left) && isBalanced(root.right) ) return true;

        return false;

    }

    private static int heightOf(Node node) {
        if(node==null){
            return 0;
        }

        return Math.max(heightOf(node.left),heightOf(node.right)) + 1;
    }
    
}

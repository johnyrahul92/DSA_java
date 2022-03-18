package com.dsa.tree.binarytree;




public class HeightOfTree {

    public static void main(String[] args) {

        System.out.println("Hi");

        BinaryTree binaryTree = new BinaryTree();

        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.right.right= new Node(4);
        root.right.right.left= new Node(5);

        System.out.println(root);
        System.out.println(binaryTree.maxDepth(root));
        System.out.println(binaryTree.maxDepthIterative(root));
        
    }
    
}

package com.dsa.trie.binarytree;

public class InOrderTraversal {

    public static void main(String[] args) {

        Tree binaryTree = new Tree();

        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);


        binaryTree.inOrderTraversal(root);
        System.out.println("-----");
        binaryTree.preOrderTraversal(root);
         System.out.println("-----");
        binaryTree.postOrderTraversal(root);



        
    }
    
}

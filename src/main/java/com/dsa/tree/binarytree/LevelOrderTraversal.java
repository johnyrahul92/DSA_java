package com.dsa.tree.binarytree;

public class LevelOrderTraversal {


    public static void main(String[] args) {
        Tree binaryTree = new Tree();

        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.right.right= new Node(4);


        binaryTree.printLevelOrder(root);
    }
    
}

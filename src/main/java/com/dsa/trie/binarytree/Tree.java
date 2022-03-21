package com.dsa.trie.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Node root;

    int maxDepth(Node node) {

        if (node == null)
            return -1;
        else {

            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            return (lDepth < rDepth ? rDepth : lDepth) + 1;
            // if (lDepth < rDepth) {
            // return rDepth + 1;
            // } else {
            // return lDepth + 1;
            // }

        }

    }

    int maxDepthIterative(Node node) {
        int height, nodeCount;

        if (node == null)
            return 0;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        height = 0;
        nodeCount = 0;
        while (true) {

            nodeCount = queue.size();
            if (nodeCount == 0)
                return height;
            height++;

            while (nodeCount > 0) {
                Node tempNode = queue.poll();
                if (tempNode.left != null)
                    queue.add(tempNode.left);
                if (tempNode.right != null)
                    queue.add(tempNode.right);

                nodeCount--;
            }

        }
    }

    void printLevelOrder(Node node) {

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(node);

        while (!queue.isEmpty()) {

            Node tempNode = queue.poll();

            System.out.println(tempNode.key);

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }

        }
    }

    void inOrderTraversal(Node node) {
        // System.out.println("In-order");
        if (node != null) {

            inOrderTraversal(node.left);

            System.out.println(node.key);

            inOrderTraversal(node.right);
        }

    }

    void preOrderTraversal(Node node){
        // System.out.println("In-order");
        if(node !=null){
            System.out.println(node.key);
            preOrderTraversal(node.left); 
            preOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(Node node) {
        // System.out.println("In-order");
        if (node != null) {
            
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.key);
        }

    }
}

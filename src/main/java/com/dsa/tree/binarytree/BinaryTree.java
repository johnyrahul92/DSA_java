package com.dsa.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
    Node root;

    int maxDepth(Node node) {

        if (node == null)
            return -1;
        else {

            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth < rDepth) {
                return rDepth + 1;
            } else {
                return lDepth + 1;
            }

        }

    }

    int maxDepthIterative(Node node){
        int height,nodeCount;

        if(node==null) return 0;

        Queue<Node> queue= new LinkedList<Node>();
        queue.add(node);
        height=0;
        nodeCount=0;
        while(true){

            nodeCount=queue.size();
            if(nodeCount==0) 
            return height;
            height++;

            while(nodeCount>0){
                Node tempNode=queue.poll();
                if(tempNode.left != null)
                queue.add(tempNode.left);
                if(tempNode.right != null)
                queue.add(tempNode.right);
                
                nodeCount--;
            }

        }
    }

    void printLevelOrder(Node node){

        Queue<Node> queue= new LinkedList<Node>();

        queue.add(node);

        while (!queue.isEmpty()) {

            Node tempNode= queue.poll();

            System.out.println(tempNode.key);

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            
        }


           

    }
    
}

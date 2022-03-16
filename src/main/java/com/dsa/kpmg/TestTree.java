package com.dsa.kpmg;



public class TestTree {

    public static void main(String[] args) {

        Node root= new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);

        

        System.out.println(root);
        
    }
    
    
}



class Node{

    int key;
    Node left,right;

    Node(int item){
        key=item;
        left=right=null;
    }

}
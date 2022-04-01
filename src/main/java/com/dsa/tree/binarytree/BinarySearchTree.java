package com.dsa.tree.binarytree;

public class BinarySearchTree {

    int prev = Integer.MIN_VALUE;

    //method one usingb in order traversal
    boolean isBST(Node root)
    {
       if(root ==null){
           return true;
       } 
        // System.out.println(prev);
        if(!isBST(root.left)){
            return false;
        }
        // do the chcejk if oprev is less than node.data
        if(prev <root.key ){
            prev=root.key;
        }else{
            return false;
        }
        
        return isBST(root.right);
        
        
        // code here.
        
    }
    
}

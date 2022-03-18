package com.dsa.tree;

import java.util.ArrayList;

public class Trie {
    // private Node root;
    // public Trie(){    
    //     root= new Node('\0');

    //     System.out.println("Inside Trie constructor");
    // }

    // public void insert(String word){
    //     Node curr=root;
    //     for (int i = 0; i < word.length(); i++) {
    //         Character c= word.charAt(i);
    //         if (curr.children[c-'a'] == null) curr.children[c-'a'] = new Node(c);
    //         curr = curr.children[c-'a'];
    //     }
    //     curr.isWord=true;
    // }

    // public boolean search(String word){
    //     Node curr=getNode(word);
    //     return curr != null && curr.isWord;

    // }

    // public boolean isStartsWith(String word){
    //     Node curr=getNode(word);
    //     return curr != null;

    // }

    // private Node getNode(String word){
    //     Node curr= root;

    //     for (int i = 0; i < word.length(); i++) {
    //         Character c= word.charAt(i);
    //         if(curr.children[c-'a']== null) return null;
    //         curr=curr.children[c-'a'];            
    //     }

    //     return curr;

    // }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Testing");
        // Trie trie= new Trie();

        // trie.insert("rahul");

        // System.out.println(trie.isStartsWith("rahu"));

        // System.out.println(trie);
        
    }
    
}

// class Node {

//     char c;
//     boolean isWord;
//     Node children[];

//     Node(char c){
//         this.c=c;
//         this.isWord =false;
//         this.children = new Node[26];

//     }
// }

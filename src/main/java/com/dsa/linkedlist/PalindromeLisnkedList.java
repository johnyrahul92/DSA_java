package com.dsa.linkedlist;

public class PalindromeLisnkedList {
    
    public  Node<Integer> findMid(Node<Integer> head) {
        if(head == null){
            return null;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast != null && fast.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        return slow;
    }

}

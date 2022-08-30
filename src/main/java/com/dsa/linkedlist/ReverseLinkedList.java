package com.dsa.linkedlist;

public class ReverseLinkedList {

    
  
    public Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null)
            return null;
        Node<Integer> prev = null;
        Node<Integer> cur = head;
        while (cur != null) {
            Node<Integer> temp = cur.nextNode;
            cur.nextNode = prev;
            prev = cur;
            cur = temp;
        }

        return prev;

    }

    
}



package com.dsa.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("Linked List");
        Node<Integer> head = new Node<>(10);
        Node<Integer> node1 = new Node<>(8);
        Node<Integer> node2 = new Node<>(15);
        Node<Integer> node3 = new Node<>(2);

        head.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = null;

        printLinkedList(head);

        ReverseLinkedList rev = new ReverseLinkedList();
        PalindromeLisnkedList pal = new PalindromeLisnkedList();
        
        Node<Integer> mid = pal.findMid(head);

        System.out.println("The mid of Linked List is : " + mid.val);
        
        Node<Integer> reversedHead = rev.reverseLinkedList(head);
       

        System.out.println("Reversed List");

        printLinkedList(reversedHead);
    }

    private static void printLinkedList(Node<Integer> head) {

        while (head != null) {
            System.out.println(head.val);
            head = head.nextNode;
        }
    }
}



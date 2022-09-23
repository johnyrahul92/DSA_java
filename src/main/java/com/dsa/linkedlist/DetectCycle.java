package com.dsa.linkedlist;

public class DetectCycle {
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> node1 = new Node<Integer>(6);
        Node<Integer> node2 = new Node<Integer>(1);
        Node<Integer> node3 = new Node<Integer>(11);
        Node<Integer> node4 = new Node<Integer>(71);
        head.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node2;


        Node<Integer> meet = detectCycle(head);

        if( meet != null){

            fincCycleStart(head,meet);
        }
    }

    private static void fincCycleStart(Node<Integer> head, Node<Integer> meet) {

        while( head != meet){
            head = head.nextNode;
            meet = meet.nextNode;            
        }

        System.out.println("Start of cycle is : "+ head.val);
    }

    private static Node<Integer> detectCycle(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while( fast != null && fast.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if( slow == fast){
                System.out.println("Cycle is Detected");
                return slow;
                
            }

           
        }
        return fast;
    }
}

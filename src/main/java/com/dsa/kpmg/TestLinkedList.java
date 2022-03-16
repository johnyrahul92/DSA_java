package com.dsa.kpmg;

import java.util.ArrayList;
import java.util.LinkedList;


public class TestLinkedList {

    public static void main(String[] args) {
        System.out.println("Try linked list");

        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(1);
        l2.add(2);

        System.out.println(l2);
        System.out.println(l2.peek());
        System.out.println(l2.getLast());
        System.out.println(l2.getFirst());

        ArrayList<Integer> l1= new ArrayList<>();

        l1.add(1);
        l1.add(2);
        
        System.out.println(l1);
        System.out.println(l1.get(1));


        
    }
    
}

package com.dsa.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestFromRight {
    

    public static void main(String[] args) {
        
       int arr[] = {1,6,8,2,7,3} ;

       PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>(Comparator.reverseOrder());

       for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);        
       }
       priorityQueue.poll();
       priorityQueue.poll();
       priorityQueue.poll();
       System.out.println(priorityQueue);

       

       
    }
}

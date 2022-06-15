package com.dsa.arrays;


import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthSmallest {

    public static void main(String[] args) {

        int[] arr = { 2, 7, -8, 9 };
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
        priorityQueue.addAll(list);
        int l=0;

        while(l<2-1){
            priorityQueue.poll();
            l++;
        }
        
        System.out.println(priorityQueue.peek());


        System.out.println(priorityQueue);
    }
}

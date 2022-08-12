package com.dsa.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {
    
    public static void main(String[] args) {
        
        List<Integer> ls  = Arrays.asList(1,3,2,9,6,7,8);
        int k  = 3;

        // kth largest elemennt is 6
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            
            pq.add(ls.get(i));
        }

        for (int i = k; i < ls.size(); i++) {

            if(pq.peek() <  ls.get(i)){
                pq.poll();
                pq.add(ls.get(i));
            }
            
        }

        System.out.println(pq.size());
        System.out.println(pq.peek());


    }
}

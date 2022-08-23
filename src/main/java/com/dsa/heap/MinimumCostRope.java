package com.dsa.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinimumCostRope {
    
    public static void main(String[] args) {


        int arr[]  ={5,4,2,7};

        //4+3 =5  -> 5,6,7
        //5+6 =11 -> 11,7
        //7+11 = 18 ->18  stop here

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        System.out.println(pq);
        int totalSum = 0;   
        while( pq.size() > 1){
            int sum = 0; 
            sum = pq.poll() + pq.poll();
            System.out.println(sum);
            pq.add(sum);
            totalSum += sum;

        }

        System.out.println("Total Sum "+ totalSum);
        
    }
}

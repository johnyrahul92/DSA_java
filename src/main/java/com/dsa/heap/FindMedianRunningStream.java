package com.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianRunningStream {

    PriorityQueue<Integer> pqMin = new PriorityQueue<>();
    PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {

        FindMedianRunningStream stream = new FindMedianRunningStream();

        stream.insertNum(1);
        stream.insertNum(9);
        stream.insertNum(5);
        stream.findMedian();
        stream.insertNum(3);
        stream.findMedian();
        stream.insertNum(2);
        stream.findMedian();

        System.out.println(stream.pqMax);
        System.out.println(stream.pqMin);

    }

    private void findMedian() {

        if( pqMax.size() == pqMin.size()){
            System.out.println((pqMax.peek()+pqMin.peek())/2 );
        } else{
            System.out.println(pqMax.peek());
        }
    }

    public void insertNum(int i) {
        if(pqMax.isEmpty() || i < pqMax.peek() ){
            pqMax.add(i);
        } else{
            pqMin.add(i);
        }


        if(pqMax.size() > pqMin.size() + 1){

            pqMin.add(pqMax.poll());
        }
        if(pqMin.size() > pqMax.size()){
            pqMax.add(pqMin.poll());
        }

    
    }
}

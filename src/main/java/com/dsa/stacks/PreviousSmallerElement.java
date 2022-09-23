package com.dsa.stacks;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        

        int arr[] = {4,10,5,18,3,12,7};

        Stack<Integer> integers = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while( !integers.isEmpty() && integers.peek() >= arr[i]){

                integers.pop();
            }

            if( integers.isEmpty()){

                System.out.print( " -1 " );
            } else{
                System.out.print( " " + integers.peek());
            }

            integers.push(arr[i]);
            
        }


    }
}

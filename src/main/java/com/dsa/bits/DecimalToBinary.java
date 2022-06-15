package com.dsa.bits;

import java.util.Stack;

public class DecimalToBinary {
    

    public static void decToBinary(int number) {

        Stack<Integer> stack = new Stack<>();

        while(number>0){            

            int val=(number &1 ) == 0 ? 0:1;
            stack.add(val);
            // System.out.print(val);
            number = number >> 1;

        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
        
    }


    public static void main(String[] args) {
        decToBinary(6);
    }
}

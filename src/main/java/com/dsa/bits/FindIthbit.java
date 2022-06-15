package com.dsa.bits;

public class FindIthbit {

    public static void main(String[] args) {

        int number=11;
        DecimalToBinary.decToBinary(number);
        System.out.println();

        //find the ith bit from left
        

        //find the mask  1<<i times and then &. if value is greater than zero. its 1 else zero;


        // here 11-> 1011  -. 2tyh bit from left is 0
        int mask=1;
        mask=mask<<2;
        int valueAtIthebit=(number&mask)>0? 1:0;
        System.out.println(valueAtIthebit);
        


        // here 11-> 1011  -. 1st bit from left is 1
        mask=1;
        mask=mask<<1;
        valueAtIthebit=(number&mask)>0? 1:0;
        System.out.println(valueAtIthebit);
        
        
        

        
    }
    
    // 

}

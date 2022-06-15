package com.dsa.bits;

public class SwapWithXor {
    public static void main(String[] args) {
        
        int a=5;
        int b=-7;

        System.out.println("a = "+ a+" b = "+b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+ a+" b = "+b);



    }
}

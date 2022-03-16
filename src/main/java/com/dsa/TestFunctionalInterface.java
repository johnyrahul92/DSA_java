package com.dsa;

public class TestFunctionalInterface {

    @FunctionalInterface
    interface Square<T>{
        int calculate(T x);
    }

    public static void main(String[] args) {

        Square<Integer> s= (x) ->  x*x;

        System.out.println(s.calculate(4));
        
    }

        
}

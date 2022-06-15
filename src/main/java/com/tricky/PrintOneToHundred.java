package com.tricky;

import java.util.stream.IntStream;

public class PrintOneToHundred {
    
    public static void main(String[] args) {
        System.out.println("Hi");

        // printRecOneToHund(10);
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }

    private static void printRecOneToHund(int i) {

        if(i==0){
            return;
        }
        System.out.println(i);
        printRecOneToHund(i-1);


    }
}

package com.dsa.recursion;

public class TestMain {
    public static void main(String[] args) {
        
        System.out.println("Recursion");

        printHello(5);
    }

    private static void printHello(int i) {

        if(i == 0){
            return;
        }
        System.out.println("Hello");
        printHello(i-1);
    }
}

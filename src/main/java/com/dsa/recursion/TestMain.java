package com.dsa.recursion;

import java.io.File;

public class TestMain {

    int a = 5;

    public static void main(String[] args) {


        

        int arr[] = { 6, 1, 3, -2 ,-1};

        int posSum = Integer.MAX_VALUE;
        int negSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                if (posSum > arr[i])
                    posSum = arr[i];

            } else {
                if (negSum < arr[i])
                    negSum = arr[i];

            }

        }

        System.out.println("Negative : "+ negSum);
        System.out.println("Positive : "+ posSum);

        if(Math.abs(negSum) >= Math.abs(posSum)){
            System.out.println(posSum);
        } else {
            System.out.println(negSum);
        }

    }

}

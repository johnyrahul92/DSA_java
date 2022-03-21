package com.dsa.general;

import java.util.LinkedList;

public class SumOfSubset {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        // String s = "abc";

        // char[] c = s.toCharArray();
        // LinkedList<Integer> list = new LinkedList<>();
        int sum=0,temp=0;

        for (int i = 0; i < arr.length; i++) {

            temp=0;

            for (int j = i; j <arr.length; j++) {
                temp+=arr[j];             
                sum+=temp;
                System.out.println("in :"+temp);
            }
            System.out.println("out :"+sum);
           

        }

        System.out.println("Sum = "+ sum);

    }

}

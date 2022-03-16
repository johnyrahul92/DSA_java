package com.dsa.kpmg;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class MaxDifference {

    public static void main(String[] args) {
        System.out.println("MaxDifference");

        int[] arr= {1,2,5,6,4};
        List<Integer> list = new ArrayList<>();

        for (Integer e : arr) {
            list.add(e);
            
        }
        Collections.sort(list);        
        //Time complexity O(nlogn)
        System.out.println("Max Diff = "+ (list.get(arr.length-1)-list.get(0)));



        int min,max =Integer.MIN_VALUE;

        if(arr[0]<=arr[1]){
            min=arr[0];
            max=arr[1];
        } else{
            max=arr[0];
            min=arr[1];
        }
        for (int i = 2; i < arr.length; i++) {

            if(min> arr[i]){
                min=arr[i];
            } else if(max<arr[i]){
                max=arr[i];
            }
            
        }

        System.out.println("Min : "+ min+" Max : "+max);
        // Time complexity o(n)
        System.out.println("Max Diff = "+ (max-min));



    }
    
}

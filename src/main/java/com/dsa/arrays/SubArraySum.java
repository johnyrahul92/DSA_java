package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    // Input:
    // N = 5, S = 12
    // A[] = {1,2,3,7,5}
    // Output: 2 4
    // Explanation: The sum of elements
    // from 2nd position to 4th position
    // is 12.

    public static void main(String[] args) {

        int inputArr[] = { 2, -1, 3, 7, 5 };

        subarraySum(inputArr, 9);

    }

    static void subarraySum(int[] arr, int s) {

        //using hashmap

        Map<Integer,Integer> hm = new HashMap<>();
        int currSum = 0;
        for (int j = 0; j < arr.length; j++) {
            
        
            
            currSum += arr[j];

            if(currSum == s){
                //found starting and ending position
                System.out.println("Start pos : "+ 0+" end Position : "+ j);
                return;

            }

            if(hm.containsKey(currSum-s)) {
                System.out.println("Start pos : "+ (hm.get(currSum -s)+ 1)+" end Position : "+ j);
                return;
            }

            hm.put(currSum, j);

        }

        System.out.println("No such position");




    }

}

package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class LargestElementsArray {
    

    public static void main(String[] args) {
        int arr[]= {17,6,9,13,8,1,2};// outout should be 17,13,8,2

        List<Integer> list=findLargesteElements(arr);

        System.out.println(list);

        
    }
    // program to find the all elements in the array for which that element is greater than all the elments to its right side.
    private static List<Integer> findLargesteElements(int[] arr) {
        int len=arr.length;
        int max= arr[len-1];
        List<Integer> list = new ArrayList<>();
        list.add(max);

        for (int i =len-1 ; i >= 0; i--) {

            if(arr[i]>max){
                max=arr[i];
                list.add(max);
            }
            
        }
        return list;
    }
}

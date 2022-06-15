package com.dsa;

import java.util.Arrays;
import java.util.Collections;

public class TestArrays {
    
    public static void main(String[] args) {
        Integer arr[]={1,2,3,7,5,8};
       

        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

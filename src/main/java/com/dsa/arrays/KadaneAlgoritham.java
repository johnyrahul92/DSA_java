package com.dsa.arrays;

public class KadaneAlgoritham {
    

    public static void main(String[] args) {
       int arr[] = {-5,4,6,-10,4};
        // int arr[] = {-5,-2,-3,4};

        // Get the max sum of sub array in the above case 4+6+ -3 + 4 = 11

        int sum = 0;
        int maxSum =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum > maxSum){
                maxSum= sum;
            }

            if(sum<0){
                sum = 0;
            }      

            
        }

        System.out.println(maxSum);

    }
}

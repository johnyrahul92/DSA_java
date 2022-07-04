package com.dsa.arrays;

public class StokBuyySell2 {

    public static void main(String[] args) {

        int arr[] = { 5, 2, 3, 7, 1, 5, 8, 3 };
        // buy at 2 to 7 -> 4 , buy at 1 to 8 -> 7 .So max profit is 12

        int profit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1])
                profit += (arr[i] - arr[i-1]);
        }

        System.out.println("Maximum profit is : " + profit);
    }
}

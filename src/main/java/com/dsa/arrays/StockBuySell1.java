package com.dsa.arrays;

import java.util.Arrays;

public class StockBuySell1 {

    public static void main(String[] args) {

        // what will be the maximum profit if you buy and sell for thr rentire period
        // one time
        int arr[] = { 5, 2, 6, 1, 4, 7 };

        // The out put should be 6-2 which is four
        // one approach is brute force where you have to have nexted for loops
        // Second approach is by uising auxilary arrya
        // {5,2,6,1,4} -> {6,6,6,4,4} then max() aux[i] - arr[]i)

        // O(n) both time and space complexity
        findBySecondApproach(arr);

        // O(n) time complexity

        findByThirdApproach(arr);

    }

    private static void findByThirdApproach(int[] arr) {

        int minSofar = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minSofar)
                minSofar = arr[i];
            if (maxProfit < arr[i] - minSofar)
                maxProfit = arr[i] - minSofar;

        }

        System.out.println("Max Profit with Approach 3 is : " + maxProfit);

    }

    private static void findBySecondApproach(int[] arr) {

        // Second Approach
        int len = arr.length;
        int maxElement = arr[len - 1];
        int aux[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {

            if (arr[i] > maxElement)
                maxElement = arr[i];

            aux[i] = maxElement;

        }

        int maxSumApproach2 = 0;

        for (int i = 0; i < aux.length; i++) {

            if (maxSumApproach2 < aux[i] - arr[i])
                maxSumApproach2 = aux[i] - arr[i];

        }

        System.out.println("Maximum sum in approach 2 is : " + maxSumApproach2);
    }
}

package com.dsa.arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = { 6, 2,10, 9, 1, 5 };

        doInsertionSort(arr);
    }

    private static void doInsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i - 1;

            while (j >= 0) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else break;
                j--;
            }

            arr[j + 1] = temp;

        }

        for (int i : arr) {

            System.out.print(" , "+ i);
            
        }
    }

}

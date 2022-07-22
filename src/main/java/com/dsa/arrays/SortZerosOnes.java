package com.dsa.arrays;

public class SortZerosOnes {

    public static void main(String[] args) {

        int arr[] = { 1, 1, 0, 1, 0, 0 };
        //int arr[] = { 0, 1, 1, 0, 1, 0, 0 };
        //int arr[] = { 0, 1, 1, 0, 1, 0, 0 };

        int pLeft = 0;
        int pRight = arr.length-1;

        while (pLeft <= pRight) {

            boolean lChanged = false;
            boolean rChanged = false;
            if (arr[pLeft] == 0 ) {
                pLeft++;
                lChanged = true;
            }

            if (arr[pRight] == 1 ) {
                pRight--;
                rChanged = true;
            }
            // while both are false in iteration pointers are stuck 
            if (!lChanged && !rChanged) {
                // swap
                int temp = arr[pRight];
                arr[pRight] = arr[pLeft];
                arr[pLeft] = temp;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

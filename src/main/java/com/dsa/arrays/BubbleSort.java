package com.dsa.arrays;


public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = { 4, 3, 7, 1, 5 };

        doBubbleSort(arr);
    }

    private static void doBubbleSort(int[] a) {

        for (int index = 0; index < a.length; index++) {

            for (int i = 0; i < a.length - index - 1; i++) {

                if (a[i] > a[i + 1])
                    swap(a, i, i + 1);

            }

        }

        for (int i : a) {

            System.out.print(" , "+ i);
            
        }
    }

    private static void swap(int[] a, int i, int j) {
        // System.out.println("Before Swap " + a[i] +" : " + a[j] );
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];

        // System.out.println("After Swap " + a[i] +" : " + a[j] );
    }
}

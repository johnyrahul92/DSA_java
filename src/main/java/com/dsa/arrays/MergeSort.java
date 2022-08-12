package com.dsa.arrays;

public class MergeSort {

    public static void main(String[] args) {
        int a[] = { 8, 0, 1, 4, 2, 9, 5 };

        doMergeSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
            
        }

    }

    private static void doMergeSort(int[] a, int i, int j) {

        if (i < j) {
            int mid = (i + j) / 2;
            doMergeSort(a, i, mid);
            doMergeSort(a, mid + 1, j);
            merge(a, i, mid, j);
        }
    }

    private static void merge(int[] a, int i, int mid, int j) {
        int a1Start = i;
        int a2Start = mid + 1;
        int k = i;
        int b[] = new int[a.length];

        while (a1Start <= mid && a2Start <= j) {

            if (a[a1Start] < a[a2Start]) {
                b[k] = a[a1Start];
                a1Start++;
            } else {
                b[k] = a[a2Start];
                a2Start++;
            }
            k++;

        }

        if (a1Start > mid) {

            while (a2Start <= j) {
                b[k] = a[a2Start];
                k++;
                a2Start++;

            }

        } else {

            while (a1Start <= mid) {
                b[k] = a[a1Start];
                k++;
                a1Start++;

            }

        }

        for (int l = i; l <= j; l++) {
            a[l] = b[l];
        }
    }
}

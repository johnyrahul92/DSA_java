package com.dsa.arrays;

import java.util.LinkedList;

public class MergeSortedArray {

    public static void mergeSortedArray(int arr1[], int arr2[]) {

        // check length of arrays
        // need to iterate through both . need to have to pointers while looping throuh
        // array

        int i = 0, j = 0;
        LinkedList<Integer> l1 = new LinkedList<>();
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                // System.out.println(arr1[i]);
                l1.add(arr1[i]);
                // increment the pointer
                i++;
            } else {
                l1.add(arr2[j]);
                // increment the pointer
                j++;
            }
        }
        // check i or j greater if i is great add the elemets in arr2 to list else in
        // reverese

        if (i > j) {

            while (j < arr2.length) {
                l1.add(arr2[j]);
                j++;
            }
        } else {
            while (i < arr1.length) {
                l1.add(arr2[i]);
                i++;
            }
        }
    }

    public static void main(String[] args) {

        // Que2 : Merge two sorted arrays into one sorted
        int arr1[] = { 1, 3, 4, 5, 6 };// 01
        int arr2[] = { -2, 4, 7, 8 };// 0
        MergeSortedArray.mergeSortedArray(arr1, arr2);
    }

}

package com.dsa.arrays;

public class BinarySearchRotatedArray {

    public static void main(String[] args) {

        int a[] = { 10, 20, 40, 70, 1, 2, 7 };

        int key = 70;

        int pos = findKey(a, key);

        System.out.println(" The Position is " + pos);

    }

    private static int findKey(int[] a, int key) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key)
                return mid;

            // if left side is sorted
            if (a[low] < a[mid]) {

                if (key >= a[low] && key < a[mid]) {
                    // element is in this partition
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                // Right side is sorted

                if(key > a[mid] && key <= a[high]){
                    //elemenmt is in this partition
                    low = mid + 1;
                } else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}

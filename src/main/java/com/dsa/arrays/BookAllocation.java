package com.dsa.arrays;

//Given number of pages in n different books and m students.
//The books are arranged in ascending order of number of pages.
//Every student is assigned to read some consecutive books.
//The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
public class BookAllocation {

    public static void main(String[] args) {

        int a[] = {  10, 15, 20,21, 25  };
        int noOfStudents = 2;

        int minNumberOfPages = findMinNumOFPages(a, noOfStudents);

        System.out.println("The minmimum no of page is  : " + minNumberOfPages);

    }

    private static int findMinNumOFPages(int[] a, int noOfStudents) {

        int maxValue = a[0];
        int sum = 0; // sum of elemnts in array;
        for (int i = 0; i < a.length; i++) {

            if (maxValue < a[i])
                maxValue = a[i];
            sum += a[i];

        }

        int min = maxValue;
        int max = sum;
        int res = 0;
        while (min <= max) {
          
            int mid = (min + max) / 2;

            if (isFeasible(a, mid, noOfStudents)) {

                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }

        return res;
    }

    private static boolean isFeasible(int[] a, int mid, int noOfStudents) {

        int student = 1;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if (sum + a[i] > mid) {
                student++;
                sum = a[i];
            } else { 
                sum += a[i];
            }
        }
        return student <= noOfStudents;
    }

}

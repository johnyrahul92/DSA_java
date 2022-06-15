package com.dsa.arrays;

import java.util.ArrayList;

public class SubArraySum {
    // Input:
    // N = 5, S = 12
    // A[] = {1,2,3,7,5}
    // Output: 2 4
    // Explanation: The sum of elements
    // from 2nd position to 4th position
    // is 12.

    public static void main(String[] args) {

        int inputArr[] = { 82, 14, 15 };

        subarraySum(inputArr, 3, 1196);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 0;
        int sum = 0;
        int minindex = i, maxindex = i;
        while (i < arr.length) {

            if (sum < s) {
                sum += arr[i];
            }
            if (sum == s) {
                // update the start and end index whioch needs +1
                maxindex = i;
                break;
            }

            if (sum > s) {

                minindex++;
                if (minindex < n) {
                    i = minindex;
                    sum = 0;
                    continue;
                } else {
                    break;
                }

                // minIdex + 1 should be i
            }
            i++;
        }
        // System.out.println(minindex+1+ " "+maxindex);
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        if (maxindex == 0 && s != sum) {
            l1.add(-1);
            return l1;
        }

        l1.add(minindex + 1);
        l1.add(maxindex + 1);

        return l1;
    }

}

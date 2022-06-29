package com.dsa.arrays;

public class MajorityElement {
    

    public static void main(String[] args) {


        int[] arr ={1,1,5,6,4};
        // if number of elements is more than n/2 where N is the length of array
        int ans=findMajorityElement(arr);

        System.out.println("The Answer is "+ ans);
    }


    // Time complexity is O(n)
    private static int findMajorityElement(int[] arr) {

        int ansIndex = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if( arr[i] == arr[ansIndex]) count++;
            else count--;

            if(count == 0){
                ansIndex = i;
                count = 1;
            }
            
        }

        System.out.println(arr[ansIndex]);
        System.out.println(ansIndex);
        int checkCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[ansIndex] == arr[i]) checkCount++;
        }

        if(checkCount>arr.length/2) return arr[ansIndex];

        return -1;
    }
}

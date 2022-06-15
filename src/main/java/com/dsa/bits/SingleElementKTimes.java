package com.dsa.bits;

public class SingleElementKTimes {
    
    public static void main(String[] args) {
        // Unique element in an array where all elements occur k times except one

        int arr[] ={1,2,1,9,2,2,1};
        //output should be 3

        int count[]=new int[32];

        System.out.println(count);

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //add ith set biots of each number
                count[i]+=   ((arr[j]>>i) & 1) > 0  ? 1 : 0;
                
            }
            
        }

        int result=0;
        int k=3; // numbert of repeating charcterr
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i]+",");

            result+= (count[i]%k) * (1<<i);
        }
        System.out.println();
        System.out.println(result);


    }
}

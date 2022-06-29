package com.dsa.arrays;



public class SquareArray {

    public static void main(String[] args) {

        int[][] a = {
            {1,2,3},
            {1,2,3},
            {1,2,3}    
        };

       for (int[] is : a) {
         for (int i = 0; i < a.length; i++) {
            System.out.println(is[i]);
             
         }
       }

    
        
    }
    

    
    
    
}

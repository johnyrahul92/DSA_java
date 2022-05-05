package com.dsa.general;

import java.util.Arrays;

public class StepSize {

    static int countRecursive=Integer.MAX_VALUE;
    static int countIterative=Integer.MAX_VALUE;

    public static void main(String[] args) {

        int steps = 9;// 1 and 2 , 3
        int[] stepSize = { 1, 2, 3 };
        // printAllStepsPossible(steps,stepSize,"");

        int arr[]= new int[steps+1];
        Arrays.fill(arr, -1);
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;
        
        countRecursive=findAllPossibleCount(steps,arr);

        countIterative=findAllPossibleCountIterative(steps,arr);
        System.out.println(countRecursive);
        System.out.println(countIterative);
        
    }

    

    private static int findAllPossibleCountIterative(int steps, int[] arr) {

        for (int index = 4; index < arr.length; index++) {

            arr[index]= arr[index -3]+arr[index -2]+arr[index -1];
            
        }

        return arr[steps];
    }



    private static int findAllPossibleCount(int steps, int[] arr) {

        if (steps==0) {
            return 0;
        }else if(steps==1) {
            return 1;
        }
        else if(steps==2) {
            return 2;
        }
        else if(steps==3) {
            return 4;
        }

        
         return findAllPossibleCount(steps-1,  arr)+
         findAllPossibleCount(steps-2,  arr)+
         findAllPossibleCount(steps-3,  arr);
    }



    private static void printAllStepsPossible(int steps, int[] stepSize, String s) {

         // base condition id steps is 0
         if (steps == 0) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i < stepSize.length; i++) {
            // find the steps
            if (steps - stepSize[i] >= 0) {
                printAllStepsPossible(steps - stepSize[i], stepSize, s + stepSize[i]);
            }

        }
    }
    
}

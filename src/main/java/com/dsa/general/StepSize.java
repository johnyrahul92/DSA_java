package com.dsa.general;

public class StepSize {

    static int count=Integer.MAX_VALUE;

    public static void main(String[] args) {

        int steps = 8;// 1 and 2 , 3
        int[] stepSize = { 1, 2, 3 };
        // printAllStepsPossible(steps,stepSize,"");
        count=findShortestNumber(steps,stepSize);
        System.out.println(count);
        
    }

    private static int findShortestNumber(int steps, int[] stepSize) {
        if (steps == 0) {           
            return 0;
        }

        for (int i = 0; i < stepSize.length; i++) {
            // find the steps
            if (steps - stepSize[i] >= 0) {
                int tempCount=1+findShortestNumber(steps - stepSize[i], stepSize);
                if(tempCount< count){
                    count=tempCount;
                }
            }

        }
        return count;


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

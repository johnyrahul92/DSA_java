package com.dsa;

public class Test {
    public static void main(String[] args) {
        System.out.println("Find factorial usinmg recursion");
        int steps = 8;// 1 and 2 , 3
        int[] stepSize = { 1, 2, 3 };
        
        findCombinations(steps, stepSize, "");

    }

    private static void findCombinations(int steps, int[] stepSize, String s) {

        // base condition id steps is 0
        if (steps == 0) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i < stepSize.length; i++) {
            // find the steps
            if (steps - stepSize[i] >= 0) {
                findCombinations(steps - stepSize[i], stepSize, s + stepSize[i]);
            }

        }

    }

    // this has to be rcursive
    private static int findFactorial(int n) {
        // base condition
        if (n == 0)
            return 1;
        // 4 ! = 4 *3! // genric solution n*f(n-1)
        return n * findFactorial(n - 1);

    }

}

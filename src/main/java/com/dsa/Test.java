package com.dsa;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       
        int[] stepSize = { 1, 2, 3 };
        Integer[] stepSize1 = { 1, 2, 3 };
        List<Integer> ls = Arrays.asList(stepSize1);

        changeArra(stepSize);
        changeArraI(stepSize1);
        changeArraO(ls);
        System.out.println("a");
        
      

    }

    private static void changeArraO(List<Integer> ls) {

        ls.set(1, 9);
    }

    private static void changeArraI(Integer[] stepSize1) {
        stepSize1[1] = 8;
    }

    private static void changeArra(int[] stepSize) {
        stepSize[1] = 8;
    }

  
     
}

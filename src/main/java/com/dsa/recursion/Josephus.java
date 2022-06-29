package com.dsa.recursion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Josephus {

    public static void main(String[] args) {

        Integer arr[] = { 1, 2, 3, 4, 5 };
        List<Integer> list = new LinkedList<>(Arrays.asList(arr));
        int pos=findTheLastManStanding(5, 3);

        System.out.println(pos);
        

    }

    private static int findTheLastManStanding(int i, int j) {

        if(i==1){
            return 0;
        }
        return (findTheLastManStanding(i-1, j)+j) % i;
    }
}

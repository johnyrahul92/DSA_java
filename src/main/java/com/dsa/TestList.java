package com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.stream.Collectors;

public class TestList {

    public static void main(String[] args) {
        System.out.println("////////////////////////////////////////////////");

        List<Integer> l1= new ArrayList<>();

        l1.add(3);
        l1.add(5);   

        List<Integer> l2 = new LinkedList<>();
        l2.add(1);

        System.out.println(l1);

        l1=l1.stream().map(x -> x*x).collect(Collectors.toList());
        int sum=l1.stream().map(x -> x*x).reduce(0,(t, u) -> t+u);
        System.out.println(l1);
        System.out.println(sum);
    }     
        
    
}

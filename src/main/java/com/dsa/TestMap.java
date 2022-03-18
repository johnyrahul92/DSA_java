package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class TestMap {

    public static void main(String[] args) {
        
        System.out.println("Test Map");

        List<Integer> l1=Arrays.asList(1,2,4,2);

        Map<Integer, Integer> m=l1.stream().collect(Collectors.toMap(value-> value,value->value*value));
        Map<Integer, Integer> m2=l1.stream().collect(Collectors.toMap(value-> value,value->value*value));

        System.out.println(m);

       
    }
    
}

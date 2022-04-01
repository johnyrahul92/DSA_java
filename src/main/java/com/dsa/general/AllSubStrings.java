package com.dsa.general;

import java.util.LinkedList;
import java.util.List;

public class AllSubStrings {

    public static void main(String[] args) {

        String input = "abcd";

        List<String> list = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {

            for (int j = i; j <= input.length(); j++) {

              list.add(input.substring(i, j));
                
            }
            
        }

        list.forEach(System.out::println);
        
    }
    
}

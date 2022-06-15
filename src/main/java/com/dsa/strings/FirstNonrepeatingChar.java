package com.dsa.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonrepeatingChar {

    public static void main(String[] args) {        

        System.out.println("First No repeating character");

        String s="racecars";


       
        for (char cs : s.toCharArray()) {

            System.out.println(cs);
            
        }



        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {

            if(list.contains(c)){
                list.remove((Character)c);
                list.add(c);
            } else{
                list.add(c);
            }

            
            
        }

        System.out.println(list);

        List<Character> list1 =list.stream().skip(3).collect(Collectors.toList());
        System.out.println(list1);

        Map<Character,Integer> map= new HashMap<>();

        // map.remove();

        for (char c : s.toCharArray()) {

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
            
        }
        for (char c : s.toCharArray()) {
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }

        

    }
    

    
}

package com.dsa.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class TwoDArray {

    public static void main(String[] args) {

        String[][] scores = {{"Bob","85"},{"Bob","87"},{"Bob","89"},{"Mark","100"},{"Charles","63"},{"Mark","34"}};

        Map<String, Integer> mp= new HashMap<>();
        for (String[] strings : scores) {

            String keyName=strings[0];
            int keyValue=Integer.parseInt(strings[1]);

            if(mp.containsKey(keyName)){
                int currValue=mp.get(keyName);
                mp.put(strings[0], (currValue+keyValue)/2);

            }
            else{
                mp.put(keyName,keyValue);
            }
            
        }


        int bestAverage=Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> s: mp.entrySet()){

            if(s.getValue()>bestAverage){
                bestAverage=s.getValue();
            }
        }

        List<Integer> ls=mp.entrySet().stream().
        filter(e -> e.getKey().equals("Bob")).
        map(Map.Entry::getValue).
        collect(Collectors.toList());

        System.out.println(ls);
        


        System.out.println(mp);
        System.out.println(mp.remove("Mark"));
        System.out.println(mp);

        System.out.println(bestAverage);
        
        



      
    }
    
}

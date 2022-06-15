package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class CompareArrays {


    public static void main(String[] args) {
        System.out.println("hi");
    }


    public static boolean check(long A[],long B[],int N)
    {
        Map<Long, Integer> mp= new HashMap<>();
        
        for(Long s : A){
            
            mp.put(s, mp.containsKey(s)? mp.get(s)+1 : 1 );
            
        }
        
        // System.out.println(mp);
         for(Long s : B){
            if(!mp.containsKey(s)){
                return false;
            }else{
                if(mp.get(s) > 1){
                     mp.put(s,mp.get(s)-1);
                    
                }else{
                    mp.remove(s);
                }
                
                
            }
        }
        
        if(mp.size()>1){
            return false;
        }
        
        return true;
    }
    
}

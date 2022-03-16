package com.dsa.kpmg;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeating {

    public Character findFirstNonrepeatingCharacter(String s){

    Map<Character,Integer> map = new HashMap<>();
      for (int i = 0; i < s.length(); i++) {

        Character key=s.charAt(i);      
          if(map.containsKey(key)){
              map.put(key,map.get(key)+1 );
          }else{
              map.put(key, 1);
          }
      }

      for (int i = 0; i < s.length(); i++) {
        Character key=s.charAt(i);

        if(map.get(key)== 1){
            return key;
        }
      }
    return null;

      
    }


    public static void main(String[] args) {

        System.out.println("FirstNonrepeating");

        // String s1= "apple";
        String s2= "racecars";

        FirstNonrepeating firstNonrepeating= new FirstNonrepeating();
        System.out.println(firstNonrepeating.findFirstNonrepeatingCharacter(s2));
        
    }
    
 
}

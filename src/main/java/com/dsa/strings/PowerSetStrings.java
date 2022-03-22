package com.dsa.strings;

public class PowerSetStrings {

    public static void main(String[] args) {
        String s="abc";

        PowerSetStrings.powerSet(s,0,"");
        
    }

    // complexity O(2^n)
    private static void powerSet(String s, int i, String string) {

        if(i==s.length()){
            System.out.println(string);
            return;
        }

        powerSet(s, i+1, string+s.charAt(i));
        powerSet(s, i+1, string);


    }
    
}

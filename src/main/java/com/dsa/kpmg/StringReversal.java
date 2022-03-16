package com.dsa.kpmg;

public class StringReversal {

    public static void main(String[] args) {
        
        String s="rahul";
        String reversedS="";

        for (int i = 0; i < s.length(); i++) {

            reversedS= s.charAt(i)+reversedS;
        }

        System.out.println(reversedS);
    }
    
}

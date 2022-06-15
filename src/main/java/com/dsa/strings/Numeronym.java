package com.dsa.strings;

import java.util.HashSet;
import java.util.Set;

public class Numeronym {
    

    public static void main(String[] args) {
        // String s1="abcde";// a2de,ab2e,a3e
        String s1="malayalam";
        findNumeronyms(s1);
    }

    private static void findNumeronyms(String s1) {
        int len=s1.length()-2;
        Set<String> finaslList= new HashSet<>();

        for (int j = 0; j < len-1; j++) {

            finaslList.add(s1.substring(0, 1)+(len-j)+s1.substring(s1.length()-j-1));
            // System.out.println(s1.substring(0, 1)+(len-j)+s1.substring(s1.length()-j-1));            
        }

        System.out.println("-------");

        for (int j = 0; j < len-1; j++) {
            finaslList.add(s1.substring(0, j+1)+(len-j)+s1.substring(s1.length()-1));
            // System.out.println(s1.substring(0, j+1)+(len-j)+s1.substring(s1.length()-1));            
        }

        System.out.println(finaslList);


        // System.out.println(s1.substring(0, 1)+i+s1.substring(s1.length()-1));
    }
}

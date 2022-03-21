package com.dsa.general;

public class AllSubStrings {

    public static void main(String[] args) {

        String input = "abcd";

        for (int i = 0; i < input.length(); i++) {

            for (int j = i; j <= input.length(); j++) {

                System.out.println(input.substring(i, j));
                
            }
            
        }
        
    }
    
}

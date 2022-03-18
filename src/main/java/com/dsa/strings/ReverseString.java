package com.dsa.strings;

public class ReverseString {

    public static void reveseString(String input) {

        String reversedString="";
     
        for (Character c : input.toCharArray()) {
               reversedString=c+reversedString;
        }
     
        System.out.println(reversedString);
        
      }

    public static void main(String[] args) {
        String input="Rahul";
        // Reverse the string    
        ReverseString.reveseString(input);
        
    }
    
}

package com.dsa.recursion;

public class Pallindrome {

    public static void main(String[] args) {
        
        String s = "racecar";

      

        System.out.println(isPallindrome(s,0,s.length()-1));
    }

    private static boolean isPallindrome(String s, int start, int end) {
        if(start>=end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return isPallindrome(s, start+1, end-1);
    }
    
}

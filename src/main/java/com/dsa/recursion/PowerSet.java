package com.dsa.recursion;

public class PowerSet {
    
    public static void main(String[] args) {
        
        findPowerSet("abc",0,"");
    }



    //  Complexity is 2 to the power n
    private static void findPowerSet(String s, int i, String cur) {

        if(i == s.length()){
            System.out.print(cur + " , ");
            return;
        }

        findPowerSet(s, i+1, cur+s.charAt(i));
        findPowerSet(s, i+1, cur);
    }
}

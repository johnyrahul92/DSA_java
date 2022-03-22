package com.dsa.strings;

public class StringRotationCheck {

    public static void main(String[] args) {
        String s1="physics";
        String s2="sicsphy";

        StringRotationCheck.check(s1,s2);

    }

    private static void check(String s1, String s2) {

        if(s1.length() != s2.length()){
            System.out.println("False");
            return;

        }

        String conCatString= s1+s1;

        int index=conCatString.indexOf(s2);
        System.out.println(index);
        if(index ==-1){
            System.out.println("False");
            return;
        } else {
            System.out.println("True");
            return;
            
        }

    }
    
}

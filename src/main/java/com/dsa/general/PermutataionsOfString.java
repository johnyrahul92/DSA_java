package com.dsa.general;

public class PermutataionsOfString {

    public static void main(String[] args) {
        System.out.println("Permuatations");

        String s= "abc";

        printPermutatations(s,"");


    }

    private static void printPermutatations(String s, String ans) {

        if(s.length()==0){
            System.out.println(ans);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String ros= s.substring(0, i)+ s.substring(i+1);

            printPermutatations(ros, ans+c);
            
        }
    }
    
}

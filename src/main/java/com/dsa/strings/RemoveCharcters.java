package com.dsa.strings;

public class RemoveCharcters {

    public static void main(String[] args) {

        String s1="Rahul";
        String s2="ulk";
        

        RemoveCharcters.perform(s1,s2);
    }

    private static void perform(String s1, String s2) {
        for (Character c : s2.toCharArray()) {

            int index = s1.indexOf(c);

            if(index == -1){
                System.out.println("Charcter not found");
            }else{
               
                s1=s1.substring(0, index)+s1.substring(index+1);
            }
            
        }

        System.out.println("final = "+s1);
    }

    
    
}

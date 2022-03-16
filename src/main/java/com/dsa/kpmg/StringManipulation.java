package com.dsa.kpmg;

public class StringManipulation {

    public String mergeStrings(String a,String b) {

        int length=0;
        String tryRemaining =null;
        if(a.length()<=b.length()){
            length=a.length();
            tryRemaining=b;
        }else{
            length=b.length();
            tryRemaining=a;
        }
        
        String finalString="";
        for (int i = 0; i < length; i++) {

            finalString+=a.charAt(i);
            finalString+=b.charAt(i);
            
        }
        for (int i = length; i < tryRemaining.length(); i++) {
            finalString+=tryRemaining.charAt(i);
        }

       System.out.println(finalString);
       return finalString;
    }

    public static void main(String[] args) {

        StringManipulation manipulation= new StringManipulation();

        String s1="abc";
        String s2="stuvwx";

        manipulation.mergeStrings(s2, s1);
        
    }
    
}

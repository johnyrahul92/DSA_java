package com.dsa.strings;

import java.util.Stack;

public class ReverseSentence {

    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        String finalString="";

        String[] splitedValues= s.split("\\.");
        int n= splitedValues.length-1;
        for (int i = n; i >0; i--) {
            finalString=finalString+splitedValues[i]+".";
            
        }
        
        finalString=finalString+splitedValues[0];
        System.out.println(finalString);
    }
        

    //     Stack<String> strings = new Stack<>();
    //     String temp="";
    //     for (char c : s.toCharArray()) {
    //         if(c !='.'){
    //             temp=temp+c;
    //         }else{
    //             strings.push(temp);
    //             temp="";
    //         }
            
            
    //     }

    //     while(strings.size()>0){
    //         finalString=finalString+strings.pop()+".";
    //     }

    //     System.out.println(temp+"."+finalString);

    // }

        
    
}

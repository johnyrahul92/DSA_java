package com.dsa.strings;


import java.util.*;



class CheckAnagram {

  


  public static void checkIsAnagram(String input1, String input2) {

    char[] inputArr1=input1.toCharArray();
    char[] inputArr2=input2.toCharArray();

    for (char c : inputArr1) {

      int index = input2.indexOf(c);
      if(index != -1){
        input2= input2.substring(0, index) + input2.substring(index+1);

      } else{
        System.out.println("Is not anagram");
      }
      
    }

  





    Arrays.sort(inputArr1);
    Arrays.sort(inputArr2);
    
    input1=new String(inputArr1);
    input2=new String(inputArr2);


    if(input1.equals(input2)) System.out.println("Is anagram");

   
    

    System.out.println(inputArr1);
    System.out.println(inputArr2);


    
      
    
  }

  public static void main(String[] args) {

    CheckAnagram.checkIsAnagram("rah","har");

    
    }
  }


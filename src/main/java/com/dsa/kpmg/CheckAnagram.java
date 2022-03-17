package com.dsa.kpmg;


import java.util.*;



class CheckAnagram {

  


  public static void checkIsAnagram(String input1, String input2) {

    char[] inputArr1=input1.toCharArray();
    char[] inputArr2=input2.toCharArray();
    Arrays.sort(inputArr1);
    Arrays.sort(inputArr2);
    
    input1=new String(inputArr1);
    input2=new String(inputArr2);

   
    

    System.out.println(inputArr1);
    System.out.println(inputArr2);


    
      
    
  }

  public static void main(String[] args) {

    CheckAnagram.checkIsAnagram("rah","har");

    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());



    for (String string : strings) {
      System.out.println(string);
    }
  }
}

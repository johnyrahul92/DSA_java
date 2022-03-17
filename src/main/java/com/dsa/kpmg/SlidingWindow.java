package com.dsa.kpmg;

import java.util.LinkedList;

class SlidingWindow {

  public static void printStrings(String s, int count) {
      int start=0;
      LinkedList<String> l1= new LinkedList<>();
      char charArray[]= s.toCharArray();
      while( start+count <= s.length()){
        int n=0;
        int inc=start;
        String element="";
        while(n<count){

          element+=charArray[inc];
          inc++; n++;


        }
        l1.add(element);
        start++;
      }

      System.out.println(l1.toString());
  }

  

  public static void main(String[] args) {
    
    String s="abdcsf";
    SlidingWindow.printStrings(s,3);
    
  }
}


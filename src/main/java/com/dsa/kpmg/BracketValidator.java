package com.dsa.kpmg;



import java.io.*;
import java.util.*;


class BracketValidator {

  


  public static void checkBracketIsbalanced(String input) {
      Character starArr[] = {'[','{','('};
      Character endArr[] = {']','}',')'};
      List<Character> startPos= Arrays.asList(starArr);
      List<Character> endPos= Arrays.asList(endArr);
      LinkedList<Character> l1= new LinkedList<>();

    for (int i = 0; i < input.length(); i++) {
      Character c= input.charAt(i);
      if(startPos.contains(c)){
        l1.add(c);
      }else if(endPos.contains(c)){
       
          //get index of from endPos
          int index= endPos.indexOf(c);
          //getValie of same from startPos
          Character startValue= startPos.get(index);
          if(l1.size()>0 && startValue== l1.getLast()){
            System.out.println("popig" + l1.getLast());
            l1.removeLast();
            }
          else{
            System.out.println("Not valid");
            break;
          }
      }
      
    }

    if(l1.size() == 0){
      System.out.println("Valid");
    } else{
      System.out.println("Not valid");
    }
    
  }

  public static void main(String[] args) {

    BracketValidator.checkBracketIsbalanced("{({[]})}");

    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());



    for (String string : strings) {
      System.out.println(string);
    }
  }
}


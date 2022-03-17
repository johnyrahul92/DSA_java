package com.dsa.kpmg;

class SecondSmallest {

    public static void secondSmallest(int arr[]) {
      int first, second= Integer.MAX_VALUE;
  
      if(arr[0]<= arr[1]){
        first=arr[0];
        second=arr[1];
  
      } else{
         first=arr[1];
        second=arr[0];
      }
  
      for (int i = 2; i < arr.length; i++) {
  
        if(arr[i]<first){
  
          second=first;
          first=arr[i];
        } else if(arr[i]<second){
          second=arr[i];
        }
        
      }
  
      System.out.println("Second smallest elemet is "+ second);
  
  
      
    } 
  
    
  
    public static void main(String[] args) {
      int arr[] = {1,3,4,6,8,9,2};
      SecondSmallest.secondSmallest(arr);
      
    }
  }
  

package com.dsa.kpmg;


import java.util.LinkedList;


public class President {


    static void selectPresidet(LinkedList<Integer> arr,int k){

        int i=0;
        while(arr.size()>1){           
            for (int j = 0; j < k-1; j++) {
                i++;
                if(i==arr.size()){
                    i=0;
                }else if(i > arr.size()){
                    i=1;
                }    
            } 
            // remove element at postion   
            System.out.println("Removing element"+arr.get(i));      
            arr.remove(i);    
        }
        System.out.println(arr.peek());

    }

  
    public static void main(String[] args) {
        System.out.println("---------President-------------");

        int arr[] = {1,2,3,4,5};//
        int k=8;
        
        LinkedList<Integer> list = new LinkedList<>();
       for (int i = 0; i < arr.length; i++) {
           list.add(arr[i]);
       }

       President.selectPresidet(list, k);

        


        
    }
    
}

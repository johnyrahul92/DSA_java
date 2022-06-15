package com.dsa.bits;

public class SingleElementWithXor {
    

    public static void main(String[] args) {
        

        // find the element from interger array which is not repeating while all ther elements are 
        // occuring in multiple of 2

        //  a^ a= 0 , a^b^a=b

        Integer arr[] = {1,4,5,8,4,1,5};
        int result=arr[0];
        for (int i = 1; i < arr.length; i++) {
            result^=arr[i];
            
        }

        System.out.println(result);
    }
}

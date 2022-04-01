package com.dsa.general;

public class RainWaterTrap {

    public static void main(String[] args) {
        
        int arr[] ={3,1,2,4,0,1,3,2};

        int quantity= findQuantity(arr);
        System.out.println(quantity);
    }

    private static int findQuantity(int[] arr) {
        int length =arr.length;
        int[] left= new int[length];
        int[] right= new int[length];

        left[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>left[i-1]){
                left[i]=arr[i];
            }else{
                left[i]=left[i-1];
            }
            
        }
        right[length-1]=arr[length-1];

        for (int i = length-2; i >= 0; i--) {
            if(arr[i]>right[i+1]){
                right[i]=arr[i];
            } else{
                right[i] = right[i+1];
            }            
        }
        int sum=0;
        for (int i = 0; i < length; i++) {

            sum= sum+ (Math.min(left[i],right[i])- arr[i]);
            
        }

        return sum;
    }
    
}

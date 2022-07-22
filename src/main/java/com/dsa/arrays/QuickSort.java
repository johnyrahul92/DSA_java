package com.dsa.arrays;

public class QuickSort {
    
    

    public static void main(String[] args) {
        
        int arr[] = {4,8,2,6,7,1,0};     

       doQuickSort(arr,0,arr.length-1);

       for (int i : arr) {
        System.out.println(i);
        
       }

        
    }

    public static void doQuickSort(int[] arr, int low, int high) {
    

        if(low < high ){
            int pivot = partition(arr,low, high);
            doQuickSort(arr, low, pivot-1);
            doQuickSort(arr, pivot+1, high);
        }

       // System.out.println("a");
        
      
    }

    public static int partition( int[] arr,int low, int high) {

        int pivot  = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            
            while(i<=j && pivot >= arr[i] ) i++;

            while(pivot < arr[j]) j--;
            
            if(i<j){
                //swap(arr,i,j);
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }

        }
        // once out of loop move the pivot ibnto correct location
        arr[low] = arr[low] ^ arr[j];
        arr[j] = arr[low] ^ arr[j];
        arr[low] = arr[low] ^ arr[j];

        return j;
    }




    

    
  
}

package com.dsa.kpmg;

public class ArrayRotation {

 public static void main(String[] args) {
    int arr[] = {3,4,5,6,1,2};
    // find the index fro the array where is the diff in sorted
    int sumPart1=0;
    int sumPart2=0;
    int indexDiff=0;

    for (int i = 0; i < arr.length; i++) {
        sumPart1+=arr[i];
        if(arr[i] > arr[i+1]){
            indexDiff=i+1;
            break;
        }
    }
    for (int i = indexDiff; i < arr.length; i++) {
        sumPart2+=arr[i];        
    }
    System.out.println("Sum part 1: " + sumPart1);
    System.out.println("Sum part 2: " + sumPart2);
 }
    
}

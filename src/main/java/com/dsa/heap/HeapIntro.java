package com.dsa.heap;

public class HeapIntro {

    public static void main(String[] args) {
        // Heap should be a complete binary tree
        //  should have heap property. Max heap Child elements should be small than parent
        //  Node  = i
        // parent = i/2
        // left child = 2*i
        // right child = 2*i +1

        // int arr[] = {20,10,40,50,5};
        int arr[] = {10,30,50,20,35,15};

        
        int a=10;
        insertToHeap(arr,a);
        deleteFromHeap(arr,a);

        heapify(arr);

        for (int i : arr) {

            System.out.println(i);
            
        }
    }

    private static void heapify(int[] arr) {
        int len = arr.length;
        int n = len/2;

        for (int i = n; i >= 0; i--) {

           // System.out.println(arr[i]);
            createHeap(arr,i,len);

           
            
        }
    }

    private static void createHeap(int[] arr, int i, int len) {

        int leftChild = 2*i;
        int rightChild = leftChild+1;

        int largest = i;

        //check which child is largest also need to check if child exists
        if(len > leftChild && arr[largest] < arr[leftChild] ){
            
            largest = leftChild;
        }
        if(len > rightChild && arr[largest] < arr[rightChild] ){
            
            largest = rightChild;
        }

        if(largest != i){

            //swap
            arr[i] = arr[i] ^ arr[largest];
            arr[largest] = arr[i] ^ arr[largest];
            arr[i] = arr[i] ^ arr[largest];

            createHeap(arr, largest, len);

        }



    }

    private static void deleteFromHeap(int[] arr, int a) {
    }

    private static void insertToHeap(int[] arr, int a) {
    }
    
}

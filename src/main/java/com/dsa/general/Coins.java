package com.dsa.general;

import java.util.Arrays;

public class Coins {

    public static void main(String[] args) {
        System.out.println("coins");
        int n =19;
        int arr[]={1,5,7};
        int dp[]=new int[n+1];

        Arrays.fill(dp, -1);
        dp[0]=0;

        int count= findCount(n,arr,dp);

        System.out.println( count);


    }

    private static int findCount(int n, int[] a, int[] dp) {

        if(n==0) return 0;
        int count= Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(n-a[i]>=0){
                int tempCount=0;
                if(dp[n-a[i]] != -1){
                    tempCount=dp[n-a[i]];
                }else{
                    tempCount = findCount(n-a[i], a,dp);                 
                 }
                 if(count> tempCount+1 && tempCount !=Integer.MAX_VALUE){
                    count=tempCount+1;
                }                
            }            
        }
        return dp[n]=count;
    }
    
}

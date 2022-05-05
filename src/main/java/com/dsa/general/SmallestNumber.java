package com.dsa.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestNumber {

    public static void main(String[] args) {
        
        // sum 9 digits 2 == output 18
        // sum 20 digits 2 == Retirn empty
        // sum 20 digits 3 == output 299
        int sum=20;
        int digits=5;
        System.out.println(findTheSmallestNumber(sum,digits));
    }

    private static String findTheSmallestNumber(int sum, int digits) {

        if(sum == 0 || sum > 9*digits){
            System.out.println("Invalid input");
            return "";
        }else{
            int[] smallest = new int[digits];       
            
            sum=sum-1;

            for (int i = digits-1; i > 0; i--) {

                if(sum-9>0){
                    smallest[i]=9;
                    sum-=9;
                }else{
                    smallest[i]=sum;
                    sum=0;
                }

           
            }
            smallest[0]=sum+1;

            
            for (int i = 0; i < smallest.length; i++) {
                System.out.print(smallest[i]);
                
            }
        }

        return null;
    }
    
}

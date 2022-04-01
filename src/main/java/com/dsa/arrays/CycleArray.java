package com.dsa.arrays;

public class CycleArray {

    public static void main(String[] args) {
        
    }

    public boolean isFalseCycle(int start, int index, int[] nums) {

        int n = nums.length;
         
        
        return (nums[index]%n == 0) || (nums[start]>0 && nums[index]>0) || (nums[start]<0 && nums[index]<0);
        
    }
    
}

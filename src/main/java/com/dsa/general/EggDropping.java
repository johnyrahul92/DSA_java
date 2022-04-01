package com.dsa.general;

public class EggDropping {
    public static void main(String[] args) {
        System.out.println("Egg Dropping");

        int floors= 10;
        int eggs = 2;

        int minCoount =findCount(floors,eggs);

        System.out.println(minCoount);
    }

    private static int findCount(int floors, int eggs) {

        if(floors==1) return 1;
        if(eggs==1) return floors;

        int count= Integer.MAX_VALUE;

        for (int i = 1; i <= floors; i++) {

            int tempCount=Math.max(findCount(floors-i, eggs), findCount(i-1, eggs-1));

            if(tempCount<count){
                count = tempCount+1;
            }

            
            
        }

        return count;
    }
    
}

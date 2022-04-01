package com.dsa.general;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
    public static void main(String[] args) {

        System.out.println("Stock Buy / sell");

        int[] a = { 100, 180, 260, 310, 40, 535, 695 };
        // int[] a = {87, 63, 92 ,97, 82 ,25};

        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        boolean checkFirstCondition = true;
        boolean checkSecondCondition = false;
        for (int i = 1; i < a.length; i++) {
            if (i-1<0){
                //it is left end
                // check if right is greater than left - first point
            }
            else if(i+1 == a.length){
                //its right end

                // checxk if left is greater than right- dont add 
            }

            if(checkFirstCondition){
                if(i-1>=0 && i+1< a.length){

                }
                

            }



            


        }

        System.out.println(mainList);

    }

}

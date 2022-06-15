package com.dsa.mathematics;

public class NumberOfTrailingNumbersFact {
    public static void main(String[] args) {
        


        // 6! = 720 -. 1*2*3*4* (5) * 6   number of 5's
        // 26! = 4032914611 2660563558 4000000 -. 1*....5***9*(5*2)....(5*3)...(5*4)...(5*5)*26  -> number of 5's is 6

        // total number of trailing zeros is n/5+ n/25+n/125 ......

        int number = 20;

        int result = 0;

        for (int i = 5; i <= number; i*=5) {

            result += number/i;
            
        }

        System.out.println(result);
    }
}

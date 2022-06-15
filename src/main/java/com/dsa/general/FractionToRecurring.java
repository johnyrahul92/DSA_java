package com.dsa.general;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurring {

    public static void main(String[] args) {
        System.out.println("Fraction to recurrning");

        // 1/3 =0.(3)
        // 1/4  =0.25

        long num=1;
        long den=4;
        String s= getUglyString(num,den);

        System.out.println(s);



    }

    private static String getUglyString(long num, long den) {
        StringBuilder builder = new StringBuilder();    
        if(num == 0) return "";

        // if( (num <0 && den>0) || (num>0 && den<0) ) builder.append("-");

        builder.append(num/den);

        if(num%den ==0) return builder.toString();
        long reminder=num%den;
        if(reminder!=0) builder.append(".");
        Map<Long,Integer> hm=new HashMap<>();
        while(reminder!=0){
            reminder=reminder*10;
            long value=reminder/den;
            if(hm.containsKey(value)){
                builder.insert(hm.get(value), "(");
                // builder.append(value);
                builder.append(")");
                break;
            }
            hm.put(value, builder.length());

            builder.append(reminder/den);
            reminder=reminder%den;
        }
       

        return builder.toString();
    }
    
}

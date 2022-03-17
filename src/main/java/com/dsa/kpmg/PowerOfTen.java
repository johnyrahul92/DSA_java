package com.dsa.kpmg;

import java.math.BigDecimal;

public class PowerOfTen {
    

    public static void main(String args[]){

        System.out.println("Power of ten");

        BigDecimal bigDecimal= new BigDecimal("00.18");
        System.out.println(bigDecimal);

        System.out.println(bigDecimal.remainder(BigDecimal.ONE));

       
        
    }
}

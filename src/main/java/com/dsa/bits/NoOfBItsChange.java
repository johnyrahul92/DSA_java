package com.dsa.bits;

public class NoOfBItsChange {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 10;

        DecimalToBinary.decToBinary(n1);
        DecimalToBinary.decToBinary(n2);

        // 111
        // 101
        // number of bits to be changes is 1

        // 10000
        // 01010
        // 11010

        int value = n1 ^ n2;
        // Count number of
        DecimalToBinary.decToBinary(value);

        // Ist Approach to right shift and check the digit is zero or 1. if 1 add count
        // int count = 0;

        // while (value != 0) {
        //     int s = (value & 1) > 0 ? count++ : 0;
        //     value = value >> 1;

        // }

        // System.out.println("nUmber of times is : " + count);


        //second approch is n&n-1

        int count=0;

        while(value != 0){
            value= value & value-1;
            count++;
        }

        System.out.println(count);



    }
}

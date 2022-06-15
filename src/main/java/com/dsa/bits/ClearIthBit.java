package com.dsa.bits;

public class ClearIthBit {

    public static void main(String[] args) {
        int number = 21;
        DecimalToBinary.decToBinary(number);
        System.out.println();

        // Clear i the bit cr
        // 21 -. 10101
        // 10101
        // 11011 & -. to get this number mask<<i times then negate it.
        // out put should be 10001
        int mask = 1;

        mask = ~(mask << 4);
        number = number & mask;
        DecimalToBinary.decToBinary(number);

    }
}

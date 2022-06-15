package com.dsa.bits;

public class SetIthBit {
    

    public static void main(String[] args) {

        int number=17;
        DecimalToBinary.decToBinary(number);
        System.out.println();
        int mask=1;

        //to set the i the bit mask=1 mask<<i times and do number|maks

      /*   set 3rd bit of 17
        10001 => 11001 */
        // mask=1;
        // mask=mask<<3;
        // number=number|mask;
        // DecimalToBinary.decToBinary(number);


        /* set 1st bit of 17
        10001 => 10011 */
        mask=1;
        mask=mask<<1;
        number=number|mask;
        DecimalToBinary.decToBinary(number);


        /* set 4th bit of 17
        10001 => 10001 */
        // mask=1;
        // mask=mask<<4;
        // number=number|mask;
        // DecimalToBinary.decToBinary(number);

    }
}

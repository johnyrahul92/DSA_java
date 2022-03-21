package com.dsa.kpmg;

import java.math.BigDecimal;

public class PowerOfTen {
    public static void main(String[] args) {
        // considering non negative numbers
        BigDecimal input = new BigDecimal(".000018").abs();

        int compare = input.compareTo(BigDecimal.ONE);
        if (compare == 0) {
            System.out.println("0th power");
        } else if (compare < 0) {
            checkForNegetivePower(input);
        } else {
            checkForPositivePower(input);
        }

    }

    private static void checkForPositivePower(BigDecimal input) {
        int count = 0;
        boolean isPowerOfTen = false;
        while (input.compareTo(BigDecimal.ONE) > 0) {
            input = input.divide(BigDecimal.TEN);
            ++count;
            if (input.compareTo(BigDecimal.ONE) == 0) {
                System.out.println(count);
                isPowerOfTen = true;
            }
        }
        if (!isPowerOfTen) {
            System.out.println(0);
        }
    }

    private static void checkForNegetivePower(BigDecimal input) {
        int count = 0;
        boolean isPowerOfTen = false;
        while (input.compareTo(BigDecimal.ONE) < 0) {
            input = input.multiply(BigDecimal.TEN);
            --count;
            if (input.compareTo(BigDecimal.ONE) == 0) {
                System.out.println(count);
                isPowerOfTen = true;
            }
        }
        if (!isPowerOfTen) {
            System.out.println(0);
        }
    }
}

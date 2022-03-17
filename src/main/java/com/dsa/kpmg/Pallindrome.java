package com.dsa.kpmg;

import java.util.*;

class Pallindrome {

    public static boolean checkPallindrome(String input1) {

        char[] inputArr1 = input1.toCharArray();

        // find the mid of ArrayList
        int inputLength = inputArr1.length;
        int mid = inputArr1.length / 2;
        System.out.println(mid);
        int i = 0;

        LinkedList<Character> l1 = new LinkedList<>();
        while (i < mid) {

            l1.add(inputArr1[i]);
            i++;

        }
        System.out.println(l1);
        if ((inputLength % 2) != 0) {
            ++mid;
        }

        while (mid < inputLength) {
            System.out.println(inputArr1[mid]);
            if (l1.getLast() != inputArr1[mid]) {
                return false;
            } else {
                l1.removeLast();

            }
            mid++;

        }

        return true;

    }

    private static boolean checkPallindromeStringRev(String input) {
        String reverse = "";
        for (Character c : input.toCharArray()) {
            reverse = c + reverse;
        }
        System.out.println(reverse + " the reve");

        return input.equals(reverse);

    }

    public static void main(String[] args) {
        String input = "rahhar";
        boolean valid = Pallindrome.checkPallindrome(input);
        boolean validStringRev = Pallindrome.checkPallindromeStringRev(input);
        System.out.println(valid);
        System.out.println(validStringRev);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}

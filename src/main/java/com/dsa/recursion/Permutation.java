package com.dsa.recursion;

public class Permutation {

    public static void main(String[] args) {
        String s="abc";

        // System.out.println(swap(s, 0, 0));
        printPermutations(s, 0, s.length() -1);
    }

    private static void printPermutations(String s, int l, int r) {

        if (l ==r) {

            System.out.println(s);
            return;

        }
        for (int j = l; j <= r; j++) {

            s = swap(s,l,j);
            printPermutations(s, l+1, r);
            s = swap(s,l,j);

        }

        
    }

    private static String swap(String s, int i, int j) {

        StringBuilder builder = new StringBuilder(s);

        builder.setCharAt(i, s.charAt(j));
        builder.setCharAt(j, s.charAt(i));

        
        return builder.toString();
    }

}

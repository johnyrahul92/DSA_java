package com.dsa.strings;


public class PermutationsOfString {

    public static void main(String[] args) {
        String s = "abc";
        PermutationsOfString.permute(s, 0, s.length() - 1);
    }

    private static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
            return;
        } else {

            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);

            }

        }

    }

    private static String swap(String s, int l, int r) {
        char temp;
        char[] c = s.toCharArray();

        temp = c[l];
        c[l] = c[r];
        c[r] = temp;

        s = String.valueOf(c);

        return s;

    }

}

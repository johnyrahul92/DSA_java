package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DuplicatesInArray {

    public static void main(String[] args) {

    }
}

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int i : arr) {

            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }

        // System.out.println(mp);
        ArrayList<Integer> ls = new ArrayList<>();

        // for (Map.Entry<Integer, Integer> s : mp.entrySet()) {

        // System.out.println(s.getKey() + " " + s.getValue());

        // }
        for (Map.Entry<Integer, Integer> s : mp.entrySet()) {
            if (s.getValue() > 1) {
                ls.add(s.getKey());
            }
        }

        if (ls.isEmpty()) {
            ls.add(-1);
        }
        return ls;
    }
}

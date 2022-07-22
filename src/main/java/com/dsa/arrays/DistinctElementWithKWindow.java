package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementWithKWindow {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 1, 3, 1, 1, 2 };
        int k = 4;

        printDistinctCountinArr(a, k);
    }

    private static void printDistinctCountinArr(int[] a, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {

            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

        }
        System.out.println(map.size());

        for (int j = k; j < a.length; j++) {
            if (map.containsKey(a[j - k])) {
                if (map.get(a[j - k]) == 1) {
                    map.remove(a[j - k]);
                } else {
                    map.put(a[j - k], map.get(a[j - k]) - 1);
                }
            }
            map.put(a[j], map.getOrDefault(a[j], 0) + 1);
            System.out.println(map.size());

        }

    }
}

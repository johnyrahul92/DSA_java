package com.dsa.kpmg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) {
        String[] dict = new String[] { "to", "toe", "toes", "dog", "dogs", "banana" };
        String input = "otesa";

        Map<Character, Integer> charCountMap = getCharCountMap(input);
        List<String> makableWords = getCreatedWords(dict, charCountMap);

        System.out.println(makableWords);
        List<String> wordsOfMaxLength = getWordsOfMaxLength(makableWords);

        wordsOfMaxLength.forEach(System.out::println);
    }

    private static List<String> getCreatedWords(String[] dict, Map<Character, Integer> charCountMap) {
        List<String> result = new ArrayList<>();
        outer: for (String word : dict) {
            Map<Character, Integer> tempMap = new HashMap<>(charCountMap);
            for (char c : word.toCharArray()) {
                if (!tempMap.containsKey(c)) {
                    continue outer;
                }
                Integer count = tempMap.get(c);
                if (count == 1) {
                    tempMap.remove(c);
                } else {
                    tempMap.put(c, --count);
                }
            }
            result.add(word);
        }
        return result;
    }

    private static Map<Character, Integer> getCharCountMap(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                Integer value = charCountMap.get(c);
                charCountMap.put(c, ++value);
            } else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }

    private static List<String> getWordsOfMaxLength(List<String> result) {
        int maxLength = Integer.MIN_VALUE;
        for (String s : result) {
            if (s.length() > maxLength) {
                result = new ArrayList<>();
                result.add(s);
                maxLength = s.length();
            } else if (s.length() == maxLength) {
                result.add(s);
            }
        }
        return result;
    }
}

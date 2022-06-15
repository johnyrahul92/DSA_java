package com.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {
        Integer arr[] = { 1, 2,2, 4, 5,4 };
        ;

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        // list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // list = list.stream().sorted(Comparator.reverseOrder()).filter(x ->(x%2==0)).map(x -> x * 2).collect(Collectors.toList());
        int sum = list.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(list);

        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(Integer::intValue));
        Map<Integer, Integer> collectCount = list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.summingInt(Integer::intValue)));
        
        collect.entrySet().forEach(e -> System.out.println(e.getKey() + "--"+ e.getValue()));
        collectCount.entrySet().forEach(e -> System.out.println(e.getKey() + "--"+ e.getValue()));

    }
}

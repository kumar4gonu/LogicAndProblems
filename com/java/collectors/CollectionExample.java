package com.java.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9);
        System.out.println(list);

        List<Integer> list1 = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(list1);

        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);

        List<Integer> list3 = list.stream().filter(x -> x > 2)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list3);

        Set<Integer> set1 = list.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(set1);

       Long count = list.stream().filter(x -> x > 5)
               .collect(Collectors.counting());
        System.out.println(count);
        Long count1 = list.stream()
                .collect(Collectors.counting());
        System.out.println(count1);


        Optional<Integer> minBy = list.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        if(minBy.isPresent())
            System.out.println(minBy.get());

        Optional<Integer> minByRev = list.stream()
                .collect(Collectors.minBy(Comparator.reverseOrder()));
        System.out.println(minByRev.get());


        List<String> strings = Arrays.asList("a","alpha","beta","gamma");

        Map<Boolean,List<String>> map = strings.stream()
                                        .collect(Collectors.partitioningBy(x -> x.length() > 2));
        System.out.println(map);

        Set<String> setSet = strings.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(setSet);

        Map<String,Long> mapVal = new HashMap<>();

        Map<Integer,Long> mapRes = list.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapRes);

        Map<String,Long> mapStr = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapStr);


    }
}

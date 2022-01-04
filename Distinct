package com.full.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,22,45,62,1,8,83,3);              // distant remove the duplicate value
        list.stream()
                .distinct()
                .forEach(System.out::println);


        List<String> list1 = Arrays.asList("a","f","t","r","a","t");
        list1.stream()
                .distinct()
                .forEach(System.out::println);


        List<Integer> list3 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);             // sort is used to sort the list
        List<Integer> sortedList = list3.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println();

        System.out.println("Sorting using comparator ");                            // sorting using comparator
        List<Integer> sortedList1 = list3.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList1);


        Comparator<Integer> compare= new Comparator<Integer>() {
            @Override
            public int compare(Integer n, Integer m) {                              // sorting using custom comparator
                return m.compareTo(n);
            }
        };
        System.out.println();
        System.out.println("Sorting using custom comparator : ");
        List<Integer> method  = list3.stream()
                .sorted(compare)
                .collect(Collectors.toList());
        System.out.println(method);


        System.out.println("Sorting using Lambda expression ");
        list3.stream().sorted((n,m) -> m.compareTo(n)).forEach(System.out::println);

    }
}

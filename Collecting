package com.full.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collecting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }                                                                                                   //  collecting all even numbers into a list.
        list.add(1);
        System.out.println("Before change "+list);
        System.out.println();
        Stream<Integer> stream = list.stream();
        List<Integer> listCollect = stream.filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println("The list elements are : ");
        System.out.println(listCollect);

        System.out.println();
        Set<Integer> list1 = list.stream().collect(Collectors.toSet());                                  //   list is converted into set o duplicate 1 is removed
        System.out.println("List are converted into set elements ");
        System.out.println(list1);


        System.out.println();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        Set<Integer> setCollect = set.stream().filter(p -> p % 2 != 0).collect(Collectors.toSet());           //  collecting all od numbers in set
        System.out.println("The set elements are : ");
        System.out.println(setCollect);




        System.out.println();
        List<Integer> list2 = new ArrayList<Integer>();

        for(int i = 1; i<= 10; i++){
            list2.add(i);
        }
        Integer[] evenNumbersArr = list2.stream().filter(p -> p % 2 == 0).toArray(Integer[]::new);              // collecting in array
        System.out.println("Array elements are : ");
        for (int i = 0; i < evenNumbersArr.length; i++) {
            System.out.print(evenNumbersArr[i]+" ");
        }
    }

}

package com.full.stream;

import java.util.*;
import java.util.function.Predicate;


public class Filtering {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);                                        // filtering the stream using lambda expression
        }
        System.out.println("Filtering the stream using lambda expression");
        list.stream().filter(p -> p%2==0).forEach(System.out :: println);
        System.out.println();


        List<Integer> list1 = Arrays.asList(14,34,56,23,556,7,54,43);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2 != 0){
                    return true;                                                // use predicate  to set a condition and filter
                }
                return false;
            }
        };
        System.out.println("Filtering the stream using custom predicate ");
        list1.stream().filter(predicate).forEach(System.out :: println);
        System.out.println();


        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Filtering the method and map with condition elements are : ");
        list2.stream().filter(p -> p%2==0).map( p -> p*p).forEach(System.out :: println);




    }
}

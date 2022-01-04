package com.full.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main<list> {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"HP",65799));
        list.add(new Product(2,"DELL",5435));
        list.add(new Product(3,"Lenova",43248));

        List<Integer> list1 = new ArrayList<Integer>();                     // without using stream
         for(Product k : list) {
             if(k.price > 3000 ){
                 list1.add(k.price);
             }
         }
        System.out.println(list1);


        List<Integer> list2 = list.parallelStream().
                filter(w->w.price > 3000).          //filtering value like if condition pipeline
                map(w -> w.price).                  // fetch the value pipeline
                collect(Collectors.toList());       // collecting as list
        System.out.println(list2);


        list.parallelStream().filter( w -> w.price > 3000).forEach(w -> System.out.println(w.name));            // to get laptop name

        int total = list.parallelStream().collect(Collectors.summingInt(w -> w.price));
        System.out.println(total);

    }
}

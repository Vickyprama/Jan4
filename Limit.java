package com.full.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1= list.stream()
                .filter(p -> p%2==0)                                         // peek is used to get result after one method complete
                .peek(p -> System.out.println(p))
                .filter(p -> p>5 )
                .collect(Collectors.toList());
        System.out.println(list1);


        Stream<Integer> stream = Stream.iterate(0,n -> n+1);
        List<Integer> list2 =stream.limit(10)
                .collect(Collectors.toList());                             // limit is used to give the limit for infinite loop
        System.out.println(list2);


        Stream<Integer> stream1= Stream.iterate(0,n -> n+2);
        List<Integer> list3 = stream1.skip(5)                               // skip is used to skip the elements in list
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list3);
    }
}


package com.full.stream;
import java.util.*;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Stream elements");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);          // fixed number of integers
        stream.forEach(p -> System.out.print(p + " "));


        System.out.println();
        Stream<Integer> stream1 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 667,});     //Stream of(array)
        System.out.println("Array stream elements");
        stream1.forEach(q -> System.out.print(q + " "));


        System.out.println();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {                                         // we are creating a stream from the List
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        System.out.println("List elements :");
        stream2.forEach(p -> System.out.print(p + " "));



        System.out.println();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {                                         // we are creating a stream from the set
            set.add(i);
        }
        Stream<Integer> stream3 = set.stream();
        System.out.println("Set  elements :");
        stream3.forEach(p -> System.out.print(p + " "));

        System.out.println();                                                                       // create stream using random numbers
        System.out.println("Create Stream using random numbers : ");
        Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(50));
        randomNumbers.limit(5).forEach(System.out::println );

        System.out.println();
        System.out.println("Builder stream ");                                                        // create stream using builder
        Stream<String> stream4 = Stream.<String>builder().add("a").add("b").add("c").build();
        stream4.forEach(p -> System.out.println(p));

    }
}

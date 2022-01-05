package com.full.stream;
import java.util.*;

import java.util.Arrays;
import java.util.stream.*;


public class Terminal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 23, 4, 5);
        list.forEach(System.out::println);                     // foreach is used to print elements


        Stream<Integer> stream = Arrays.asList(1, 2, 3, 5, 6, 9).stream();
        Integer array[] = stream.toArray(Integer[]::new);
        System.out.println("Array elements");
        System.out.println(Arrays.toString(array));

        IntStream numbers = IntStream.iterate(0, n -> n+1);
        int array1[] = numbers.limit(10).toArray();
        System.out.println("Elements of int stream ");
        System.out.println(Arrays.toString(array1));




        List<Employee> list1 = new ArrayList<>(Arrays.asList(
                new Employee(1,"Vignesh",100),
                new Employee(2,"Gayatri",200),
                new Employee(3,"Prama",200),
                new Employee(4,"Kabil",300)
        ));

        Employee[] arr = list1.stream().filter(p -> p.salary < 300).toArray(Employee[]::new);
        System.out.println(Arrays.toString(arr));

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> minnum = list2.stream().min((n, m) -> n.compareTo(m));            // to find min ofr number
        System.out.println("Smallest number "+ minnum.get() );


        Comparator<Integer> mincompare = new Comparator<Integer>() {
            @Override
            public int compare(Integer n, Integer m) {
                return n.compareTo(m);
            }
        };
        Optional<Integer> minnum1= list2.stream().min(mincompare);                           // to find min of number using comparator
        System.out.println("Smallest number using comparator "+ minnum1.get() );



        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> maxnum = list3.stream().max((n, m) -> n.compareTo(m));          // to find max number
        System.out.println("Highest  number "+ maxnum.get() );

        Comparator<Integer> maxcompare = new Comparator<Integer>() {
            @Override
            public int compare(Integer n, Integer m) {
                return n.compareTo(m);
            }
        };
        Optional<Integer> maxnum1 = list3.stream().max((n, m) -> n.compareTo(m));          // to find max number using comparator
        System.out.println("Highest  number using comparator"+ maxnum1.get() );


        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("The number of elements : ");
        System.out.println(list4.stream().count());                                                 // count is used to counting number

        List<Integer> list5 = list4.stream().filter( p -> p%2==0).collect(Collectors.toList());
        long count = list5.stream().collect(Collectors.counting());                                     // using counting method in collect
        System.out.println(list5);
        System.out.println(count);

        boolean match = list4.stream().anyMatch(p -> p==6);                                 // anymatch is used to search related match
        System.out.println(match);

        boolean allMatch = list4.stream().allMatch(p -> p%3==0);                        //check all elements to satisfy condition
        System.out.println(allMatch);                                                   //it returns true if satisfy or false

        boolean noneMatch = list4.stream().noneMatch(p -> p!=5);
        System.out.println(noneMatch);                                             //it returns true if condition is not match with any element

        list4.stream().findFirst().ifPresent(System.out::println);              //findFirst is used to find first element

        list4.stream().parallel().findAny().ifPresent(System.out::println);    //findAny in stream give first element in parallel give other value

    }
}

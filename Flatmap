package com.full.stream;
import java.util.*;
import java.util.stream.Collectors;

public class Flatmap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);                                 // flat map is used combine two or three into single
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println("After combining all the array using flatmap: ");
        System.out.println(listOfAllIntegers);


        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        List<String> list = Arrays.stream(array)
                .flatMap(p -> Arrays.stream(p))
                .collect(Collectors.toList());
        System.out.println(list);


    }

}

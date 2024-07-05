package com.prac;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateItems {


    public static void main(String[] args) {


        /**
         * Remove Duplicate elements from ArrayList
         */

        List<Integer> al = List.of(1,2,3,1,4,5,4,1,3,4,55,66,77);

        List<Integer> uniqueList = al.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("---------------");

        Set<Integer> lhs = new LinkedHashSet<>(al);

        List<Integer> noDuplicateList = new ArrayList<>(lhs);

        System.out.println(noDuplicateList);



        String s = "siddharth";
        
        char[] sArrsay = s.toCharArray();

        Arrays.sort(sArrsay);

        System.out.println(String.valueOf(sArrsay));

        int n = 2;

        boolean b = IntStream.rangeClosed(2, n / 2)
                .noneMatch(x -> n % x == 0);

        if(b){
            System.out.println("Prime");
        }
        else {
            System.out.println("\n Not Prime");
        }


    }
}

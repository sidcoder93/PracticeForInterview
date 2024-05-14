package com.prac;

import org.apache.spark.sql.catalyst.expressions.SecondsToTimestamp;
import org.apache.spark.sql.catalyst.optimizer.LikeSimplification;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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




    }
}

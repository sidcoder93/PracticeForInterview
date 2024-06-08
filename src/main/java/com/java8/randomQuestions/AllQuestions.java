package com.java8.randomQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllQuestions {


    public static void main(String[] args) {

        m1();

    }


    /*
    How do you find frequency of each element in an array or a list?
     */
    public static void m1()
    {

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

       Map<String, Long> count = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(count);


    }
}

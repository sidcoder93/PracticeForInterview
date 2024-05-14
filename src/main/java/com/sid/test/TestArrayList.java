package com.sid.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayList {

    public static void main(String[] args) {


       List<Integer> arr =  List.of(1,2,3,3,4,5,1,4);

       arr.stream().distinct().forEach(System.out::println);
    }
}

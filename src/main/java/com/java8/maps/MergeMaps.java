package com.java8.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeMaps {

    public static void main(String[] args) {


        /**
         * Merge 2 maps with same keys
         */


        System.out.println("------------  Using Merge -------------------");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("sid", 1);
        map1.put("vaidya", 2);
        map1.put("aay",3);
        map1.put("nadal",4);



        Map<String, Integer> map2 = new HashMap<>();
        map2.put("sid", 5);
        map2.put("virat",6);
        map2.put("aay", 7);
        map2.put("sachin", 10);


        Map<String, Integer> map3 = new HashMap<>(map1);

        map2.forEach((k, v) -> map3.merge(k,v, (oldValue, newValue) -> oldValue));

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        System.out.println("-------------------Using Stream.concat()-------------------");


        HashMap<String, Integer> collect = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));

        System.out.println(collect);



    }



}

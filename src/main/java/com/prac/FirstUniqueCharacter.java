package com.prac;

import java.lang.management.ManagementPermission;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstUniqueCharacter {


    public static char firstUniqueChar(String s) {
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string to count character frequencies
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again to find the first unique character
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        // If no unique character found, return a default character, e.g., '#'
        return '#';
    }


    static void firstUniqueCharaterUsingStream(String str){


        Optional<Character> aLong = str.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();


        System.out.println(aLong.get());


    }

    static void firstRepeatedCharaterUsingStream(String str){


        Optional<Character> aLong = str.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst();


        System.out.println(aLong.get());


    }

    static void arrayCheck(){

        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        int[] arr = {1,2,4,5,6,7};

        boolean present = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue() > 1);

        if(present){
            System.out.println("Array is Not unique");
        }
        else{
            System.out.println("Unique ");
        }

    }

    public static void main(String[] args) {


        /**
         * Find the find unique character in the String
         */

        System.out.println(firstUniqueChar("aaabc"));

        firstUniqueCharaterUsingStream("Siddharth");

        firstRepeatedCharaterUsingStream("Siddharrth");
        arrayCheck();




    }
}

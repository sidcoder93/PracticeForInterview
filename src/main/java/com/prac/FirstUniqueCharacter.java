package com.prac;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {


        /**
         * Find the find unique character in the String
         */

        System.out.println(firstUniqueChar("aaabc"));


    }
}

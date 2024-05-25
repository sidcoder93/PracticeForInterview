package com.prac;

import java.sql.SQLDataException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEight {

    public static void main(String[] args) {

        String st = "Siddharth Vaidya";

      Map<Character, Long> map =   st.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      map.forEach((k,v) -> System.out.println(k + "-" +v));





      for(Map.Entry<Character, Long> vowel: map.entrySet()){

          System.out.println(vowel.getKey() + "-" + vowel.getValue());
      }

        exceptionTest();
    }

    private static void seprateOddAndEven(){

        List<Integer> oddEven = List.of(1,4,5,6,7);

        Map<Boolean, List<Integer>> collect = oddEven.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

    }

    private static void exceptionTest(){


        try{
            System.out.println("a");
            throw new ArithmeticException();

        }catch (RuntimeException ex){

            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        System.out.println("d");
    }

}

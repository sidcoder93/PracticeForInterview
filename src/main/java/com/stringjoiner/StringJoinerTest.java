package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerTest {

    /*
    StirngJoiner
    String.join()
    Collectors.joining()
     */

    public static void main(String[] args) {


        StringJoiner sj = new StringJoiner(",");

        sj.add("A");
        sj.add("B");
        sj.add("C");
        sj.add("D");

        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner("|");
        sj1.add("E");
        sj1.add("F");
        sj1.add("G");

        StringJoiner merge = sj.merge(sj1);

        System.out.println(merge);


    }
}

package com.sid.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent {

    public static void main(String[] args) {


        Student st1 = new Student("Sid", 10);
        Student st2 = new Student("An", 20);
        Student st3 = new Student("Anu", 15);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);


        list.stream().map(Student::getName).forEach(System.out::println);

       Collections.sort(list, new Comparator<Student>() {
                   @Override
                   public int compare(Student o1, Student o2) {
                       return Integer.compare(o1.getAge(), o2.getAge());
                   }
               });


               list.stream().map(Student::getName).forEach(System.out::println);
    }
}

package com.concurrentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionTest {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        list.add("first");list.add("first");
        list.add("first");
        list.add("first");

        Runnable t1 = () -> {
            //task thread1
            for(String item: list){
                System.out.println(item);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable t2 = () -> {

            list.add("next element");
            list.add("next element");
            list.add("new element");

        };

        new Thread(t2).start();
        new Thread(t1).start();




    }
 }

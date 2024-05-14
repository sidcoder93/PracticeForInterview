package com.sid.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncArrayList {

    public static void main(String[] args) {


        List<Integer> integers = Collections.synchronizedList(new ArrayList<Integer>());

        integers.add(1);
        integers.add(2);
        integers.add(3);

        synchronized (integers) {
            Iterator<Integer> it = integers.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}

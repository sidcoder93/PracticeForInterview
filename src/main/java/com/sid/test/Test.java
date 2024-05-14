package com.sid.test;

public class Test  implements Runnable{
    @Override
    public void run() {

        long id = Thread.currentThread().getId();
        System.out.println("Thread Running is "+id);
        System.out.println(Thread.currentThread().getName());
        for(int i=1; i<=10; i++){
            System.out.println("value of int: "+i);
        }

    }


}

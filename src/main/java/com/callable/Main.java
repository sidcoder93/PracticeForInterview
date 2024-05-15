package com.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Main Method start");

        FutureTask[] futureTasksArray = new FutureTask[5];

        for (int i=0; i<5; i++){

            Callable<Integer> myCallable = new Task();

            futureTasksArray[i] = new FutureTask<>(myCallable);

            Thread t = new Thread(futureTasksArray[i]);

            t.start();
        }

        for (int i=0; i<5; i++){

            System.out.println(futureTasksArray[i].get());
        }

        System.out.println("Main Method End");



    }
}

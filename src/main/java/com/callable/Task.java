package com.callable;

import org.apache.spark.sql.sources.In;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        Random generator = new Random();
        int randomNumber = generator.nextInt(5);

        Thread.sleep(randomNumber * 1000);

        return randomNumber;



    }

    }


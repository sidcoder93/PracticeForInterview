package com.sid.test;

public class Main {

    public static void main(String[] args) {

            Thread thread =  new Thread(new Test());
            thread.setName("TestThread");
            thread.start();
    }
}

package com.virtualpairprogrammers;

public class TestSingleton {

    private static volatile  TestSingleton instance = null;
    private TestSingleton(){}

    public static TestSingleton getSingleton(){

        if(null==instance){
            synchronized (TestSingleton.class) {
                if (null == instance) {
                    instance = new TestSingleton();
                }
            }

        }
        return instance;
    }


}

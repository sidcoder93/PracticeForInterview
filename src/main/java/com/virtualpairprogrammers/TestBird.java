package com.virtualpairprogrammers;

public class TestBird {

    public static void main(String[] args) {

        Bird eagle = new Eagle();
        Bird parrot = new Parrot();

        eagle.setName("Eagle");
        parrot.setName("Parrot");

        String name = eagle.getName();
        System.out.println(name);

        System.out.println(eagle.food());


    }
}

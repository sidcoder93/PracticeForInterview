package com.prac;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    public static void main(String[] args) {

        int[] array = {1,2,0,0,3};

        //System.out.println("Intial Array "+ array);


        int index=0;

        for(int i = 0; i<array.length; i++){

            if(array[i] != 0){

                array[index] = array[i];
                index++;
            }
        }

        for (int i = index; i<array.length; i++){

            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));

        //output -> {1,2,3,0,0}


    }
}

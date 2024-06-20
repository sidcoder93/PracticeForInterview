package com.prac;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

    public static void main(String[] args) {

        int[] array = {1,2,0,0,3};

        //System.out.println("Intial Array "+ array);
        startWithZero();


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

    public static void startWithZero(){


        int[] arr = {1,1,0,0,0,1,1,1,0,1,0};

        int index=arr.length-1;

        for(int i=arr.length-1; i>=0; i--){


            if(arr[i]!=0){

                arr[index]=arr[i];
                index--;
            }

        }

        for(int i= index; i>=0; i--){

            arr[i]= 0;
        }


        System.out.println(Arrays.toString(arr));
    }



}

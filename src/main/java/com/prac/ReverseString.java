package com.prac;

public class ReverseString {


    public static void main(String[] args) {


        String st = "I Love India";    //I evol aidni

        String[] arr = st.split(" ");

        String reverse = "";
        for(int i=0; i<arr.length; i++){

            String s = arr[i]+" ";  //Love

            for (int j=s.length()-1; j>=0; j--)
            {
                reverse = reverse.concat(String.valueOf(s.charAt(j))) ;//I
            }
        }

        System.out.println(reverse);
        reverseName();
    }

    private static void reverseName(){

        String st = "Siddharth Vaidya";

        String rev = "";

        String[] arr = st.split(" ");

        for (int i= arr.length-1; i>=0; i--){

            rev = rev + arr[i] + " ";
        }
        System.out.println(rev);
    }
}

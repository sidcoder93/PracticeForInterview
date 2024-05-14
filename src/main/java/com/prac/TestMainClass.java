package com.prac;

public class TestMainClass {

    public static void main(String[] args) {

        TestMainClass solution = new TestMainClass();
        int[] nums = {2,7,11,15};

        int[] arr =  solution.twoSum(nums, 13);

        System.out.println ("Output: "+arr.toString());

    }

    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        for(int i=0; i<nums.length; i++){

            for (int j=i+1; j< (nums.length)-1; j++){

                int sum = nums[i]+nums[j];
                if(sum==target){

                    output[0] = i;
                    output[1]= j;
                    return output;
                }
            }

        }

        return output;


    }

    static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u');
    }

}

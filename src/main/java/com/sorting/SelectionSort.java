package com.sorting;

public class SelectionSort {

    // Java program for implementation of Selection Sort

    //  {64,25,12,22,11}
        void sort(int[] arr)
        {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];   //arr[1]= 64, arr[2]=25
                arr[i] = temp;           //arr[0]=25, arr[0]=12
            }
        }

        // Prints the array
        void printArray(int arr[])
        {
            int n = arr.length;
            for (int j : arr) System.out.print(j + " ");
            System.out.println();
        }

        // Driver code to test above
        public static void main(String[] args)
        {
            SelectionSort ob = new SelectionSort();
            int[] arr = {64,25,12,22,11};
            ob.sort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }






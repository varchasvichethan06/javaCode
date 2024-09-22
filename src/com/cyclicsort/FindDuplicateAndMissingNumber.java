package com.cyclicsort;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateAndMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        cyclicSort1toN(arr);
        int[] ans = returnNums(arr);
        System.out.println(Arrays.toString(ans));


    }

    static int[] returnNums(int[] arr){
        // this will return only the first duplicate , if you want all duplicates to be printed then  use List and add them
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                return new int[]{ arr[i], i + 1 };    //returning the duplicate value first and then the missing value
            }
        }
        return new int[]{ -1 ,-1 };
    }

    static void cyclicSort1toN(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct_index = arr[i] - 1; // we are using the concept of indices here
            if(arr[i] < arr.length && arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{                           // if the element is already in it's place then just skip and increment i
                i++;                        // that is move to next element
            }
        }
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

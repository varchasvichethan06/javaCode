package com.cyclicsort;

import java.util.Arrays;
import java.util.Scanner;

/* basically cyclic sort has to be used when the range is 0 - n or 1 - n numbers
 we know that indices start from 0 , so for range 1 to N , the correct index will be value - 1;
                    eg : 1 will be in 0th index i.e index = 1 - 1 = 0
                         2 will be in 1st index  --> index = value - 1
                                                           = 2 - 1 i.e 1 so index is 1

 */
public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        cyclicSort0toN(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort1toN(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] - 1; // we are using the concept of indices here
            if(arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{                           // if the element is already in it's place then just skip and increment i
                i++;                        // that is move to next element
            }
        }
    }


    static void cyclicSort0toN(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] ; //so the range is from 0 to n , as we know index also starts from 0 to N
            if(arr[i] != arr[correct_index]){
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

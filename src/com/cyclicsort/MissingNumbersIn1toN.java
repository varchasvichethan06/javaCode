package com.cyclicsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumbersIn1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        cyclicsort1toN(arr);
        List<Integer> missNums = new ArrayList<Integer>();
        missNums = missingNumbers(arr);
        System.out.println(missNums);
    }


    static List<Integer> missingNumbers(int[] arr){   // this is for 1 to N
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != i + 1){                // only this part will change if 0 to N --> arr[i] != i
                ans.add(i + 1);                 // ans.add(i)
            }
        }
        return ans;
    }


    static void cyclicsort1toN(int[] arr){
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

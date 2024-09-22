package com.cyclicsort;

import java.util.Scanner;

/*
First cyclic sort as 1 to N ( positives are mentioned) then see which element is missing and then return that)
if -ve is there just ignore , that's why we add a case arr[i] > 0 only then swap

eg -> [3,4,-1,1]  i = 0 , 3 should be in 2nd index so swap -1 and 3
      [-1,4,3,1]  i = 0 , as -1 < 0 just increment i
      [-1,4,3,1] i = 1 , 4 should be in 3rd index so swap 4 and 1
      [-1,1,3,4] i = 1 , 1 should be in 0th index so swap -1 and 1
      [1,-1,3,4] now array is sorted

      so check for the missing number and just return it


eg 2 -> [3,2,1,4]  i = 0 , 3 should be in 2nd pos , so swap 3 and 1
        [1,2,3,4] i = 0 , it'll check as 1 is in 0th , i++ then as all are in correct place , array is sorted

        so return next positive integer i.e size + 1 , here size is 4 so 5 should be returned

 */

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        cyclicsort1toN(arr);
        int ans = missingFirstPos(arr);
        System.out.println(ans);
    }


    static int missingFirstPos(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                return i + 1;         // return the missing number
            }
        }
        return arr.length + 1;   //the case where 1 to N is already present in the array eg -> [1,2,3,4......10] so 11
                                //                          will be the next positive missing no
    }

    static void cyclicsort1toN(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] - 1; // we are using the concept of indices here
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct_index]){
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

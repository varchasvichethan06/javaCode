package com.Arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Input -> [1,2,3,4,5,6] and n = 3
Output will be [1,4,2,5,3,6]

i/p -> [1,2,3,4] and n=2
o/p will be [1,3,2,4]
 */
public class ShuffleSameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];
        System.out.println("enter n for the array");
        int tar = sc.nextInt();

        System.out.println("enter elements");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] shuffledArr = Shuffle(arr,tar);
        System.out.println(Arrays.toString(shuffledArr));

    }

    static int[] Shuffle(int[] arr , int n){
        int index = 0;
        int[] ans = new int[2 * n];
        for(int i = 0,j=n;i < n; i++, j++){
            ans[index++] = arr[i];
            ans[index++] = arr[j];
        }
        return ans;
    }
}

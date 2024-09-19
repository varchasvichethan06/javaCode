package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();  //size of array

        int[] arr = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
       while(i < j){
           swapArr(arr,i,j);
           j--;
           i++;
       }
        System.out.println(Arrays.toString(arr));
    }

    static void swapArr(int[] x,int a,int b) {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}

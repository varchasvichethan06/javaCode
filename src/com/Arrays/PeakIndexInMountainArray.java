package com.Arrays;

import java.util.Scanner;

/*
A bitonic array or mountain array is an array where it'll increase till a certain index and then decrease later

eg -> [0,1,0]
eg -> [1,2,4,7,3,2] here peak is 7
 */
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = searchPeak(arr);
        System.out.println(ans);
    }

    static int searchPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] > arr[mid + 1]) {              // we are on the decreasing side
                end = mid;
            }
            else{
                start = mid + 1;            // we are in the increasing
            }

        }
        return start; // we can return end as well as at this case start and end will point to same variable.
    }
}

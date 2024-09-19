package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];
        System.out.print("enter search element");
        int k = sc.nextInt();

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // here our assumption is the array is sorted
        int ans = binary(arr,k);
        System.out.println(ans);
    }

    static int binary(int[] arr, int search){
        int start = 0;
        int end = arr.length - 1; //last element
        while( start <= end){
            int mid = start + ((end - start)/2);

            if(search < arr[mid]){
                end = mid - 1;
            }
            else if(search > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

package com.Recursion;

import java.util.Scanner;

public class BinarySearchRecursion {
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
        int ans = search(arr,k,0,arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target,int start, int end){
        if(arr.length == 0 || start > end){
            return -1;
        }

        int mid = start + ((end - start)/2);
        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr,target,start,mid - 1);
        }
        return search(arr,target,mid + 1,end);
    }
}

package com.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class MountainArraySearch {
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

        int ans = searchInMountain(arr,k);
        System.out.println(ans);
    }


    static int findPeak(int[] arr){
        int start=0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + ((end - start)/2) ;

            if(arr[mid] > arr[mid+1]){          // we are in descending order
                end = mid;
            }
            else{
                start = mid + 1;            // when a[mid] < a[mid+1]
            }
        }
        return arr[start];
    }


    static int searchInMountain(int[] arr,int target){
        int peak;  // here peak is the actual value not the index
        peak = findPeak(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){             // when we found the element in the left hand side only
            return firstTry;
        }
        return binarySearch(arr,target,peak + 1,arr.length-1); //here we are adding peak + 1 so that it'll start searching from next element
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        boolean isAsc = arr[start] < arr[end] ;  // checking if array is in ascending order or descending
        while(start <= end){
            int mid = start + ((end - start)/2) ;

            // when we find the element in the middle only
            if (arr[mid] == target) {
                return mid;
            }

            // if ascending
            if(isAsc){
                // if element is lesser than middle
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

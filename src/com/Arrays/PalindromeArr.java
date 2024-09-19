package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();  //size of array

        int[] arr = new int[n];
        System.out.print("Enter the elements of array:");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        boolean isPal = false;

        while(start < end){
            isPal = isPalindrome(arr,start,end);
            start++;
            end--;
        }
        if(isPal){
            System.out.println(Arrays.toString(arr) + " Array is Palindrome");
        }
        else{
            System.out.println(Arrays.toString(arr) + " Array is not a Palindrome");
        }
    }

    static boolean isPalindrome(int[] a,int x,int y) {
        return a[x] == a[y];
    }
}

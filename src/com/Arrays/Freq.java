package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
input arr -> sorted/unsorted both can work -> [0,1,1,2,3,4,4]
then output distinct number of digits here it'll be 5
 */

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();       // size of array

        int[] arr = new int[n];

        System.out.print("enter the elements of array");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);    //sorting the array here
        int ans = distinctNum2(arr);
        System.out.println(ans);
    }

    static int distinctNum(int[] arr){
        int[] freq = new int[10];
        int count = 0;
        for ( int i : arr){
            freq[i]++;
        }
        for(int i : freq){
            if(i != 0){
                count++;
            }
        }
        int[] newArray = new int[count];
        for(int i = 0; i < freq.length ; i++){
            if(freq[i] != 0){
                newArray[i] = i;
            }
        }
        System.out.println(Arrays.toString(newArray));
        return count;
    }

    static int distinctNum2(int[] arr){
        int uniqueIndex = 1;        // when the current ele and previous element is different we'll update it.

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] != arr[i-1]){
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;

    }
}

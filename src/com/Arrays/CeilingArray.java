package com.Arrays;


// a ceiling of a number is the smallest number which is equal to or greater than the target.
/*
arr -> [2,3,6,8,12,23,35] -> target is 18
the ceiling no would be 23
if target is 12
then ceiling is also 12
 */

/*
for floor of a no
is the greatest number which is equal to or lesser than the target
arr -> [2,3,6,8,12,23,35] -> target is 18
floor will be 12
 */
import java.util.Arrays;
import java.util.Scanner;

public class CeilingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the target element: ");
        int num = in.nextInt();
        int ans = ceilingNum(arr,num);
       System.out.println("the Ceiling number of "+ num + " is: " + ans);
    }

    static int ceilingNum(int[] arr, int target){
        int start=0;
        int end = arr.length - 1;

        if( target > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
       return arr[start];           // here for ceiling as end < start we return start
    }                               // for floor we return end as end < start
}

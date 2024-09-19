package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// it should be in logn time //
// array -> {1,2,3,4,4,4,4,4,4,5,6}
// then target is 4 andre , it should return first occurence index and last occurence index.
// if element not found then just return -> {-1,-1}
public class BinarySearchRange {
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
        int[] range = new int[2];
        range = searchArray(arr,k);
        System.out.println(Arrays.toString(range));
    }

    static int[] searchArray(int[] arr , int target){
        int[] ans = {-1, -1};

        ans[0] = searchSequence(arr,target,true);
        // this is because if the ans[0] is -1(i.e when element not found, then no use of checking for last occurence)
        if(ans[0] != -1){
            ans[1] = searchSequence(arr,target,false);
        }
        return ans;
    }


    // this function is used to return either first occurence or last occurence of target if found
    static int searchSequence(int[] arr, int target,boolean isFirstIndex){
        int index = -1;
        int start = 0;
        int end = arr.length - 1;

        while( start <= end){
            int mid = start + ((end - start) / 2);
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{ // the middle element can be the answer , but there's a possibility that this isnt the first occurence
                index = mid ;
                if(isFirstIndex){
                    end = mid - 1;      // IMAGINE arr [1,2,3,3,4,5] -> here mid would be index 3 -> but there is another
                                    // 3 in the 2nd index , so we need re-initailse end to prev ele of mid
                }
                else{
                    start = mid + 1; // IMAGINE arr [1,2,3,4,4,5] -> here mid would be index 3 val 4 -> but there is another
                    // 4 in the next index , so we need re-initailse start to next ele of mid to find last occurence
                }
            }

        }
        return index;
    }
}

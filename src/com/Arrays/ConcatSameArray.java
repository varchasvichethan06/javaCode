package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatSameArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int m = n*2;
//        int[] ans = getConcatenation(arr);
//        System.out.println(Arrays.toString(ans));

        int[] concat = new int[m];
        System.arraycopy(arr , 0 , concat ,0,n);      // here firstly the org array is being copied from arr to concat
       System.arraycopy(arr , 0 , concat ,n,n); // here it starts copying from array's length i.e nth position of new array
        System.out.println(Arrays.toString(concat));
    }

    static int[] getConcatenation(int[] nums) {
        int run = nums.length * 2;
        int[] ans = new int[run];

        for(int i = 0;i < run;i++){
            if(i < nums.length){                    // it'll run till 1st array size
                ans[i] = nums[i];
            }
            int j=0;
            while(i >= nums.length && j < nums.length){         // it'll run after half of new array
                ans[i]=nums[j];
                j++;
                i++;
            }
        }
        return ans;

    }

}

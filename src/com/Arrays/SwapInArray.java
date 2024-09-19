package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("This is your Array: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the swap indexes: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        swapArr(arr,x,y);
        System.out.println("This is your Array after swapping " + x +" and "+ y + "Index");
        System.out.println(Arrays.toString(arr));
    }

    private static void swapArr(int[] arr,int i1,int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

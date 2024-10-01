package com.Strings;


import java.util.Scanner;

/*
        *           row = 1 , col = 1
        * *         row = 2 , col = 1
        * * *       i = 1 , j = 2
        * * * *
 */
public class AsteriskPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

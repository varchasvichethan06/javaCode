package com.Recursion;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int n){
        if( n <= 1 ){
            return 1;
        }
        return fact(n-1) * n;
    }
}

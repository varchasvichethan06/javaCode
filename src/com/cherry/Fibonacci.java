package com.cherry;

import java.util.Scanner;

public class Fibonacci {

   static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // with recursion
        System.out.println("the fibonacci is : "+ fib(num));

        // without using recursion
//        int n1 = 0,n2 = 1;
//        int n3 ;
//        if(num == 0){
//            System.out.println(num);
//        }
//        for(int i = 2;i <= num;i++){
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//        }
//        System.out.println("the fibonacci is: " + n2);

    }
}


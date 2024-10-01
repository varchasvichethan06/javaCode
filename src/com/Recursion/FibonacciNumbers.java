package com.Recursion;

import java.util.Scanner;

/*
Recursive tree when n = 4

                        main()
                          |
                        fib(4)
                    /           \
                fib(3)    +   fib(2)
                 /   \          /  \
            fib(2) + fib(1) fib(1) + fib(0)
             /  \
        fib(1) + fib(0)

 */

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fib = fibonacci(N);
        System.out.println(fib);
    }

    static int fibonacci(int n) {
        if(n == 1 || n == 2){
            return n - 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

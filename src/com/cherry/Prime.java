package com.cherry;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num == 0 || num == 1){
            System.out.println("Not prime");
        }
        boolean isPrime = true;
        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0) {
                System.out.println("Not Prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }

    }
}

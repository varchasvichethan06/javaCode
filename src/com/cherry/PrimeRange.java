package com.cherry;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }

    }

         static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // 0 and 1 are not prime numbers
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // If divisible by any number, it's not prime
                }
            }
            return true;
        }
}





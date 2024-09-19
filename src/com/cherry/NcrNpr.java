package com.cherry;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        System.out.println("Enter r: ");
        int r = sc.nextInt();

        int s = n - r;
        int pr=0,cr=0;

        pr = fact(n) / fact(s);
        cr = fact(n) / (fact(s) * fact(r));

        System.out.println("Permutation is: " + pr);
        System.out.println("Combination is: " + cr);
    }

    static int fact(int num){
       int mul = 1;
       if( num == 0){
           return 1;
       }
       for(int i = 1;i <= num;i++){
            mul *= i;
        }
        return mul;
    }
}

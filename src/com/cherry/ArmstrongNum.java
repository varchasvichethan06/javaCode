package com.cherry;


import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int original = num ;
        while(num > 0){
            int rem = num % 10;
            sum += rem*rem*rem;
            num /= 10;
        }

        return sum == original;
    }
}

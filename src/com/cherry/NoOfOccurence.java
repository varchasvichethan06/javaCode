package com.cherry;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NoOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the occurence number : ");
        int n = sc.nextInt(); //this n is the number inputed from the user to check the occurence
        int count = 0;

        while(num > 0){
            int rem = num % 10;   // you get the last digit when you modulus the number by 10
            if(rem == n){
                count++;
            }
            num /= 10;          // when you divide any number  by 10 then you will have the last digit removed
        }
        System.out.println(count);
    }
}

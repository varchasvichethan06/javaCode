package com.cherry;


import java.util.Scanner;

public class PalindromeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orgNum = sc.nextInt();      // don't use the same variable as we need to compare later
        int tempNum = orgNum;     // we are taking new variable to compare it later as the original number will vary
        int revNum = 0;
        while(tempNum > 0){
           int rem = tempNum % 10 ;               // we are taking the last digit here
           revNum = revNum * 10 + rem;          // we are trying to reverse the int
           tempNum /= 10;                         // we are removing the last digit from number
        }
        if(orgNum == revNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}

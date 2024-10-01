package com.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.next();
        boolean isPalindrome = false;
        pal = pal.toLowerCase();
        if(pal == null || pal.length() == 0 ){
            System.out.println("Yes it's a palindrome");
        }
        for (int i = 0, j = pal.length() - 1; i <= j; i++ , j--) {
            if(pal.charAt(i) == pal.charAt(j)){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.printf("Yes , the string %s is a palindrome",pal);
        }
        else{
            System.out.printf("No , the string %s is not a palindrome",pal);
        }
    }
}

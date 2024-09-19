package com.Arrays;


import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.next();
        System.out.print("Enter the character you want to search: ");
        char ch = in.next().trim().charAt(0);
        boolean ans = search2(str,ch);
        if(ans){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }


    }

    static boolean search(String s,char ch){
        if(s.length() == 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String s,char ch){
        if(s.length() == 0){
            return false;
        }
        for (char x : s.toCharArray()) {
            if(ch == x ){
                return true;
            }
        }
        return false;
    }
}

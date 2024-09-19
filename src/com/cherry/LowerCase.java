package com.cherry;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);

        if(c >= 'a' && c<='z'){
            System.out.println("Yes it's in lower case");
        }
        else{
            c = Character.toLowerCase(c);
            System.out.println("Now it's converted to lower case : " + c);
        }
    }
}

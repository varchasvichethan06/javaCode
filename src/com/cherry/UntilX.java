package com.cherry;


import java.util.Scanner;

public class UntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
       while(true){
           Integer num = sc.nextInt();
           if(num.toString().trim().charAt(0) == 'x' || num.toString().charAt(0) =='X'){
               break;
           }
           else {
               sum = sum + num;
           }
       }
        System.out.println(sum);
    }
}

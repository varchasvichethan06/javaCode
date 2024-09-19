package com.cherry;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

      /*
        while(num > 0){
            int rem = num % 10;     // we are getting the last digit
            System.out.print(rem); // print the last digit without linebreak and spaces
            num /= 10;             //then reduce each digit by this
        }
       */
        int ans = 0;                // let's take 123 as ex
        while(num > 0){             // num = 321 , ans = 0          num = 12 , ans = 3
            int rem = num % 10;     // iteration 1 -> rem = 3       it 2 -> rem = 2
            num /= 10;              // then num = 12                then num = 1
            ans = ans * 10 + rem;   // here ans = 0*10+3 = 3        ans = 3*10+2 = 32
        }
        System.out.println(ans);
    }
}

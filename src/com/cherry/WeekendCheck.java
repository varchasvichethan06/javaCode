package com.cherry;

import java.util.Scanner;

public class WeekendCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        /*  Enhanced switch case
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
         */

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

/*
        switch (day){
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
             default:
                System.out.println("Enter valid day");
                break;
        }

 */
    }
}

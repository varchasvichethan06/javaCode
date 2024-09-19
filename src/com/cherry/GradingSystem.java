package com.cherry;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String grades = Grades(marks);
        System.out.println(grades);
    }

    static String Grades(int num){
        String grade = null ;
        if(num >= 41 && num <= 50){
            grade = "DD";
        }
        else if(num <= 40){
            grade = "Fail";
        }
        else if(num >= 51 && num <= 60){
            grade = "CD";
        }
        else if(num >= 61 && num <= 70){
            grade = "BC";
        }
        else if(num >= 71 && num <= 80){
            grade = "BB";
        }
        else if(num >= 81 && num <= 90){
            grade = "AB";
        }
        else if(num >= 91 && num <= 100){
            grade = "AA";
        }
        else{
            grade="Invalid";
        }

        return grade;
    }
}

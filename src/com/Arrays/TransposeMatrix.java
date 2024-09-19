package com.Arrays;



import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();  //no of rows
        int c = in.nextInt(); //no of cols
        int[][] arr = new int[r][c];
        int[][] trans = new int[c][r];

        for(int i = 0;i < r;i++){
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i != j){
                    trans[j][i] = arr[i][j];
                }
                else{
                    trans[i][j] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(trans[i]));
        }

        /*
        if you want to do it in the same matrix , it works only for square matrix

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
         */
    }
}

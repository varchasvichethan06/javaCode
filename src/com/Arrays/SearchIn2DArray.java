package com.Arrays;

/*
This is a row-wise and column-wise sorted matrix
            1, 3, 5, 7
Second row: 2, 4, 6, 8
Third row:  9, 10, 11, 12
Fourth row: 13, 14, 15, 16
let's consider target to be 15

so initially start will be at [0,0] and end will be at[0,3]
here increment row means go to next row of the same column

1st r=0 c=last index; element will be 7 , 7 < 15 , so next row  ( increment row )
2nd r=1 , c= last index -> element will be 8 , 8 < 15 so next row
3rd r=2 , c = last column -> element will be 12 , 12 < 15 so next row
4th r = 3 , c = last column -> element will be 16 , as 16 > 15 , now decrement column
5th r = 3 , c = last column - 1 -> elem will be 15 as 15 == 15 return row and column as interger array

if element not found return -1
 */


import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Eneter the size of square matrix : ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        System.out.print("Enter the elements of matrix : ");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the search element : ");
        int k = in.nextInt();

        int[] ans = new int[2];
        ans = searchInArray(matrix,k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInArray(int[][] mat,int target){
        int row = 0;
        int column = mat.length - 1;

        while(row < mat.length && column >= 0 ){
            if(mat[row][column] == target){
                return new int[]{row,column};
            }
            if(target < mat[row][column]){
                column--;
            }
            if(target > mat[row][column]){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}

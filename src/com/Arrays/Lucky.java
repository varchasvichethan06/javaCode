package com.Arrays;

// a lucky no is a no which is min in the row and max in the column
public class Lucky {

    // Method to find the saddle point in the matrix
    public static void findSaddlePoint(int[][] matrix) {
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;     // Number of columns
        boolean found = false;

        // Traverse through each row
        for (int[] ints : matrix) {
            // Find the minimum element in the current row and its column index
            int minRowValue = ints[0];
            int minColIndex = 0;
            for (int j = 1; j < m; j++) {
                if (ints[j] < minRowValue) {
                    minRowValue = ints[j];
                    minColIndex = j;
                }
            }

            // Check if this minimum element is the maximum in its column
            boolean isSaddlePoint = true;
            for (int[] value : matrix) {
                if (value[minColIndex] > minRowValue) {
                    isSaddlePoint = false;
                    break;
                }
            }

            // If it's a saddle point, print it and set the flag
            if (isSaddlePoint) {
                System.out.println("Saddle point found: " + minRowValue);
                found = true;
                break;
            }
        }

        // If no saddle point was found, print a message
        if (!found) {
            System.out.println("No saddle point exists.");
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        // Call the method to find the saddle point
        findSaddlePoint(matrix);

    }
}

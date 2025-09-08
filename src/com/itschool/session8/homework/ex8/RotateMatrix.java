package com.itschool.session8.homework.ex8;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //System.out.println(n);
        int [][] rMat = new int [m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rMat[j][n-i-1] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

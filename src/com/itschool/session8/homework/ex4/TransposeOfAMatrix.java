package com.itschool.session8.homework.ex4;

public class TransposeOfAMatrix {
    public static int [][] transposeOfAMatrix(int[][] matrix) {
        int[][] tMat = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tMat[j][i] = matrix[i][j];
            }
        }
        return tMat;
    }
}

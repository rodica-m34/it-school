package com.itschool.session8.homework.ex6;

public class AddTwoMatrices {
    public static void addTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] newMat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                newMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

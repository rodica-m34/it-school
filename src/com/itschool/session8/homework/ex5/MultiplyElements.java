package com.itschool.session8.homework.ex5;

public class MultiplyElements {
    public static void multiplyElementsOfAMatrix(int[][] matrix, int elem) {
        int[][] mMat = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mMat[i][j] = matrix[i][j] * elem;
            }
        }
        for (int[] ints : mMat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

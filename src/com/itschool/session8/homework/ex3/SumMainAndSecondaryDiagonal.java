package com.itschool.session8.homework.ex3;

public class SumMainAndSecondaryDiagonal {
    public static void sumMainandSecondaryDiagonal(int[][] matrix) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sum2 += matrix[i][matrix.length - 1 - i];
        }
        System.out.println(sum1 + " " + sum2);
    }
}

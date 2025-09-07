package com.itschool.session8.homework.ex6;

public class Main {
    public static void main(String[] args) {
        //- Add two matrices of the same size.
        int[][] matrix1 = new int[][] {{1, 2, 3}, {1, 2, 3}, {0, 1, 2}};
        int[][] matrix2 = new int[][] {{1, 2, 3}, {0, 1, 5}, {2, 7, 2}};
        AddTwoMatrices.addTwoMatrices(matrix1, matrix2);
    }
}

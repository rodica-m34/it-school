package com.itschool.session8.homework.ex7;

public class Main {
    public static void main(String[] args) {
        //- Check if a matrix is symmetric (equals its transpose).
        int[][] matrix = {{1, 7, 1}, {1, 1, 1}, {1, 1, 1}};
        System.out.println(MatrixIsSymmetric.isSymmetric(matrix));
    }
}

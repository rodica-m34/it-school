package com.itschool.session8.homework.ex4;

public class Main {
    public static void main(String[] args) {
        //- Find the transpose of a matrix.
        int[][] matrix = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int [][] tMat = TransposeOfAMatrix.transposeOfAMatrix(matrix);
        for (int[] ints : tMat) {
            for (int i : ints) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

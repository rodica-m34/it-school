package com.itschool.session8.homework.ex7;

import static com.itschool.session8.homework.ex4.TransposeOfAMatrix.transposeOfAMatrix;

public class MatrixIsSymmetric {

    public static boolean isSymmetric(int[][] matrix) {
        if (matrix.length!=matrix[0].length)
        {
            return false;
        }
        int [][] tMat = transposeOfAMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]!=tMat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

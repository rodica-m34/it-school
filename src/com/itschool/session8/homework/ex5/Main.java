package com.itschool.session8.homework.ex5;

public class Main {
    //- Multiply every element of a matrix by a given constant.
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        MultiplyElements.multiplyElementsOfAMatrix(matrix, 2);
    }
}

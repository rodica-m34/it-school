package com.itschool.session8.homework.ex2;

public class SumOfElements {
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}

package com.itschool.session8.homework.ex1;

import java.util.Scanner;

public class ReadAndPrint {

    public static void readAndPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

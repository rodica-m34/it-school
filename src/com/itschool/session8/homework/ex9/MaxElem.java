package com.itschool.session8.homework.ex9;

public class MaxElem {
    public static void findMaxElement(int [][]matrix)
    {
        int max =Integer.MIN_VALUE, col = 0, line=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]>max)
                {
                    max=matrix[i][j];
                    col=j;
                    line = i;
                }
            }
        }
        System.out.println("Max element is: "+max + " on line "+line+" and column "+col);;
    }
}

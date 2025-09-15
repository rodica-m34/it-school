package com.itschool.session12.recapitulare.javaBasic;

public class FloatingPointPrecision {
    //4. Floating Point Precision: Write a program that calculates the average of three floating-point numbers.
    //What happens if the sum of the three numbers exceeds the maximum value that can be represented by a float?
    // How can you handle this scenario?
    public static void main(String[] args) {
        float a = 4.4888888888f;
        float b = 754444444333.18f;
        //float c = Float.MAX_VALUE;
        float c= 3.14567890f;
        if ((a<Float.MAX_VALUE-b) && (a + b) < Float.MAX_VALUE - c) {
            float average = (a + b + c) / 3;
            System.out.printf("%.10f", average);
        }
        else
            System.out.println("Average calculation is not possible");
    }
}

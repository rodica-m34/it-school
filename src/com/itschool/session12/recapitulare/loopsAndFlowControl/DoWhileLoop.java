package com.itschool.session12.recapitulare.loopsAndFlowControl;

import java.util.Scanner;

public class DoWhileLoop {
    //Do-While Loop: Write a program that prompts the user to enter a number and calculates the sum of the digits
   // of that number using a do-while loop. Print out the sum of the digits
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum=0;
        while (number!=0)
        {
            int rest=number%10;
            sum+=rest;
            number=number/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}

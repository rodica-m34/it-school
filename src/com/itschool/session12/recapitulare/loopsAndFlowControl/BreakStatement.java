package com.itschool.session12.recapitulare.loopsAndFlowControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BreakStatement {
   // Break Statement: Write a program that prompts the user to enter a series of numbers until they enter a negative number.
    //Calculate the sum of the positive numbers using a break statement to exit the loop when a negative number is entered.
    public static void main(String[] args) {
        breakStatement();
    }
    public static void breakStatement() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            if (number >= 0) {
                sum += number;
            } else {
                System.out.println("You have entered a negative number");
                System.out.println("The sum of positive numbers is "+sum);
                break;
            }
        }
    }
}

package com.itschool.session12.recapitulare.loopsAndFlowControl;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        /* 6. Continue Statement: Write a program that prompts the user to enter a series of numbers and calculates
        the sum of the even numbers using a continue statement to skip over the odd numbers.
        The program ends when 0 is entered.*/
        sumOfEvenNumbers();
    }

    public static void sumOfEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number != 0) {
                if (number % 2 != 0) {
                    continue;
                }
                sum += number;
            } else {
                System.out.println("You have entered 0! ");
                System.out.println("Sum of even numbers is " + sum);
                break;
            }
        }
    }
}

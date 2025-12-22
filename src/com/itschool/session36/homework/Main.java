package com.itschool.session36.homework;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            scanner.useLocale(Locale.US);
            System.out.println("Please insert the first operand:");
            double operand1 = scanner.nextDouble();
            System.out.println("Please insert the second operand:");
            double operand2 = scanner.nextDouble();
            System.out.println("Please insert the operator:");
            char operator = scanner.next().charAt(0);
            System.out.println(calculate(operand1, operand2, operator));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        }
    }

    private static double calculate (double operand1, double operand2, char operator){
        double result = 0;
        try {
            switch (operator) {
                case '+' -> result = operand1 + operand2;
                case '-' -> result = operand1 - operand2;
                case '*' -> result = operand1 * operand2;
                case '/' -> {
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result = operand1 / operand2;
                }
                default -> throw new IllegalArgumentException ("Unexpected value: " + operator);
            };
        } catch (ArithmeticException e) {
            System.out.println("Division by zero operation cannot possible");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operator");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        return result;
    }
}

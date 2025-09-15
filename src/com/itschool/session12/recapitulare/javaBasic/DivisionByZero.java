package com.itschool.session12.recapitulare.javaBasic;

public class DivisionByZero {
    //2. Division by Zero: Write a program that divides two int values. What happens if the second value is zero?
    //How can you handle this scenario?
    public static void main(String[] args) {
        int a=10;
        int b=0;
        division(a,b);
    }
    public static void division (int a, int b){
        if (b==0){
            System.out.println("Division is not possible");
            return;
        }
        System.out.println(a/b);
    }
}

package com.itschool.session17.homework.ex3;

public class Main {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(70, 75, 55);
        System.out.println(studentA.getPercentage());

        StudentB studentB = new StudentB(70, 75, 55, 100);
        System.out.println(studentB.getPercentage());
    }
}

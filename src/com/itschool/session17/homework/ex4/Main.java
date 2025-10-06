package com.itschool.session17.homework.ex4;

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        //default constructor was overridden in parent class and automatically called when object created
        subClass.aMethod();
        //this is the abstract method implemented in subclass
        subClass.anotherMethod();
        //method from parent class accessible in subclass through inheritance
    }
}

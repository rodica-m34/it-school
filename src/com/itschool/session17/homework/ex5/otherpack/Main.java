package com.itschool.session17.homework.ex5.otherpack;

public class Main {
    public static void main(String[] args) {
        Animal animal1= new Cat("Zuzi");
        System.out.print(animal1.getName());
        animal1.makeSound();

        Animal animal2= new Dog("Rex");
        System.out.print(animal2.getName());
        animal2.makeSound();
    }
}

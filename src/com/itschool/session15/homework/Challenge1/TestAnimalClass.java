package com.itschool.session15.homework.Challenge1;

public class TestAnimalClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Wolf wolf = new Wolf();
        wolf.makeSound();
    }
}

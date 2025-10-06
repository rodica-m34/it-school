package com.itschool.session17.homework.ex5.otherpack;

public class Dog extends Animal{
    protected Dog(String name) {
        super(name);
    }

    @Override
    protected void makeSound() {
        System.out.println(name + " dog barks");
    }
}

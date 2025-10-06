package com.itschool.session17.homework.ex5.otherpack;

public class Cat extends Animal{

    protected Cat(String name) {
        super(name);
    }

    @Override
    protected void makeSound() {
        System.out.println(" cat meows");
    }
}

package com.itschool.session17.homework.ex5.otherpack;

public abstract class Animal {

    final String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected abstract void makeSound ();
}

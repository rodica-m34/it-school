package com.itschool.session17.homework.ex5.otherpack;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void makeSound ();

}

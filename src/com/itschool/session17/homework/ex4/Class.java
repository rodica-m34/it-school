package com.itschool.session17.homework.ex4;

public abstract class Class {
    protected Class() {
        System.out.println("This is constructor of abstract class");
    }

    protected abstract void aMethod ();

    protected void anotherMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}

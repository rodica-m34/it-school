package com.itschool.session20.recapitulare.ex7;

public abstract class Shape {
    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract double area();
}

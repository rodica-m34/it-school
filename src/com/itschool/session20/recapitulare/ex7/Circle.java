package com.itschool.session20.recapitulare.ex7;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    protected double area() {
        return Math.PI*radius*radius;
    }
}

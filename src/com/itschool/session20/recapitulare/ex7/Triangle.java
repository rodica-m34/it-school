package com.itschool.session20.recapitulare.ex7;

public class Triangle extends Shape{
    private int height;
    private int base;

    public Triangle( int height, int base) {
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    @Override
    protected double area() {
        return (double)(height*base)/2;
    }
}

package com.itschool.session20.recapitulare.ex7;

public class Rectangle extends Shape{
    private final int length;
    private final int width;

    public Rectangle(int width, int length) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    @Override
    protected double area() {
        return length*width;
    }
}

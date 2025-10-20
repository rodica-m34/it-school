package com.itschool.session20.recapitulare.ex8;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped ");
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }
}

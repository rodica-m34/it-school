package com.itschool.session20.recapitulare.ex8;

public class Truck implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Truck accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }
}

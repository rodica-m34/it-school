package com.itschool.session20.recapitulare.ex8;

public class Motorcycle implements Vehicle
{
    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }
}

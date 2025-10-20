package com.itschool.session20.recapitulare.ex8;

public class Main {
    public static void main(String[] args) {
        //Create an interface Vehicle with methods such as start(), stop(), and accelerate().
        // Create classes such as Car, Truck, and Motorcycle that implement the Vehicle interface,
        // and implement the methods differently. Use these classes to create a traffic simulation that simulates
        // different types of vehicles on a road.
        // Facuta la curs !
        Vehicle vehicle1 = new Car();
        simulateTraffic(vehicle1);
        Vehicle vehicle2 = new Truck();
        simulateTraffic(vehicle2);
        Vehicle vehicle3 = new Motorcycle();
        simulateTraffic(vehicle3);
    }
    public static void simulateTraffic (Vehicle vehicle){
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        System.out.println("===============");
    }
}

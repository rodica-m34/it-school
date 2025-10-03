package com.itschool.session15.homework.Challenge2.multiLevelInheritance;

public class TestCarClass {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Highlander", 2024);
        System.out.println(car);
        car.start();
        car.accelerate();
        car.stop();
        System.out.println("---------------------------------");

        ElectricCar electricCar = new ElectricCar("Toyota","bZ4X" ,2025, 57.7, 252);
        System.out.println(electricCar);
        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();
        electricCar.charge();
        System.out.println("---------------------------------");

        Tesla tesla = new Tesla( "Model3", 2025, 82, 626, 3.0);
        System.out.println(tesla);
        tesla.charge();
        tesla.start();
        tesla.enableAutopilot();
        tesla.accelerate();
        tesla.stop();
    }
}

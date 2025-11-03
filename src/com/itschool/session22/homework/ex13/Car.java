package com.itschool.session22.homework.ex13;

import java.util.Objects;

public class Car {
    private final String brandName;
    private final String color;

    public Car(String brandName, String color) {
        this.brandName = brandName;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return Objects.equals(brandName, car.brandName) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(brandName);
        result = 31 * result + Objects.hashCode(color);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package com.itschool.session22.homework.ex14;

public enum CarType {
    SUV (40000, "Toyota"),
    HATCHBACK (35000, "Ford"),
    CONVERTIBLE (55000, "Mazda"),
    COUPE (56000, "BMW"),
    SEDAN (25000, "Honda"),
    SPORTSCAR (68000, "Chevrolet");

    private final double averagePrice;
    private final String manufacturer;

    CarType(double averagePrice, String manufacturer) {
        this.averagePrice = averagePrice;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "averagePrice=" + averagePrice +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

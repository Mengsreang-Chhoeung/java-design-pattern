package com.ms.java.design.pattern.introduction_to_oop.pillars_of_oop.inheritance;

public class Main {
    public static void main(String[] args) {
        // Instantiate an object
        Car car = new Car();
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.modelName);
        car.go();
    }
}

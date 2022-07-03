package com.ms.java.design.pattern.introduction_to_oop.pillars_of_oop.inheritance;

public class Car extends Vehicle {
    // Fields
    public String brand = "Lexus";
    public String modelName = "Mustang";
    
    // Method
    public void go() {
        super.run();
        System.out.println("and back...");
    }
}

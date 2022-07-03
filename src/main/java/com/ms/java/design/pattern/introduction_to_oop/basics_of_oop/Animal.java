package com.ms.java.design.pattern.introduction_to_oop.basics_of_oop;

public class Animal {
    // Fields
    public String name;
    public String sex;
    public int age;
    public int weight;
    public String color;
    
    // Methods
    public void breathe() {
        System.out.println("Breathe.");
    }
    
    public String eat(String food) {
        System.out.println("Eating " + food + ".");
        return food;
    }
    
    public String run(String destination) {
        System.out.println("Run from " + destination + ".");
        return destination;
    }
    
    public int sleep(int hours) {
        System.out.println("Sleeping " + hours + " hours.");
        return hours;
    }
}

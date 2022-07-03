package com.ms.java.design.pattern.introduction_to_oop.pillars_of_oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Animal animal = new Animal();
        animal.animalSound();
        
        Dog dog = new Dog();
        dog.animalSound();
        
        Cat cat = new Cat();
        cat.animalSound();
    }
}

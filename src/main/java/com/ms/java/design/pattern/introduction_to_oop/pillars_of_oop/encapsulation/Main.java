package com.ms.java.design.pattern.introduction_to_oop.pillars_of_oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Instantiate an object
        Person per = new Person();
        per.setName("Kok Koko");
        per.setSex("Male");
        System.out.println("Name: " + per.getName() + "\tSex: " + per.getSex());
    }
}

package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.association;

public class Main {
    public static void main(String[] args) {
        // Instantiate an object
        Professor pro  = new Professor();
        pro.student.output();
    }
}

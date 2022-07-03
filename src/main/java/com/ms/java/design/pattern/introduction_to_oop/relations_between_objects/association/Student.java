package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.association;

public class Student {
    // Fields
    protected int id;
    protected String name;
    protected String sex;
    
    // Constructor
    public Student(int _id, String _name, String _sex) {
        this.id = _id;
        this.name = _name;
        this.sex = _sex;
    }
    
    // Method
    public void output() {
        System.out.println("ID: " + this.id + "\tName: " + this.name + "\tSex: " + this.sex);
    }
}

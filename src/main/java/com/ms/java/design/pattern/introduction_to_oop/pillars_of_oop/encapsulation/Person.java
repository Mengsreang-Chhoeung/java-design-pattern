package com.ms.java.design.pattern.introduction_to_oop.pillars_of_oop.encapsulation;

public class Person {
    // Fields
    private String name;
    private String sex;
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public String getSex() {
        return this.sex;
    }
    
    // Setters
    public void setName(String _name) {
        this.name = _name;
    }
    
    public void setSex(String _sex) {
        this.sex = _sex;
    }
}

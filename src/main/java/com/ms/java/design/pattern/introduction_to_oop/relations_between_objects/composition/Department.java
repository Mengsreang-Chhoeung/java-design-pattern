package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.composition;

public class Department {
    // Fields
    private Long id;
    private String name;
    
    // Constructor
    public Department(Long _id, String _name) {
        this.id = _id;
        this.name = _name;
    }
    
    // Getters
    public Long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
}

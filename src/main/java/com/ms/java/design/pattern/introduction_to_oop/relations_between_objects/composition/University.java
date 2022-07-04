package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.composition;

import java.util.List;

public class University {
    // Fields
    private String name;
    private final List<Department> departments;
    
    // Constructor
    public University(String _name, List<Department> _departments) {
        this.name = _name;
        this.departments = _departments;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    
    public List<Department> getDepartments() {
        return this.departments;
    }
    
    // Method
    public void getUniversityInfo() {
        System.out.println("Universirty name: " + this.getName() + " and have " + this.getDepartments().size() + " departments.");
        System.out.println("There are: ");
        for (Department department : this.departments) {
            System.out.println("ID: " + department.getId() + " Name: " + department.getName());
        }
    }
}

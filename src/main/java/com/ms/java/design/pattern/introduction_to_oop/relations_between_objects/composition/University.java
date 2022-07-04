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
    
    // Method
    public void getUniversityInfo() {
        System.out.println("Universirty name: " + this.name + " and have " + this.departments.size() + " departments.");
        System.out.println("Therer are: ");
        for (Department department : this.departments) {
            System.out.println("ID: " + department.getId() + " Name: " + department.getName());
        }
    }
}

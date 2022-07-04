package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.aggregation;

import java.util.List;

public class Department {
    // Fields
    private Long id;
    private String name;
    private List<Professor> professors;
    
    // Constructor
    public Department(Long _id, String _name, List<Professor> _professors) {
        this.id = _id;
        this.name = _name;
        this.professors = _professors;
    }
    
    // Getters
    public Long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<Professor> getProfessors() {
        return this.professors;
    }
    
    // Method
    public void getDepartmentInfo() {
        System.out.println("Department ID: " + this.getId() + " Name: " + this.getName() + " and have " + this.getProfessors().size() + " professors.");
        System.out.println("There are: ");
        for (Professor professor : this.professors) {
            System.out.println("ID: " + professor.getId() + " Name: " + professor.getName() + " Subject: " + professor.getSubject());
        }
    }
}

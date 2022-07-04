package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.aggregation;


public class Professor {
    // Fields
    private Long id;
    private String name;
    private String subject;
    
    // Constructor
    public Professor(Long _id, String _name, String _subject) {
        this.id = _id;
        this.name = _name;
        this.subject = _subject;
    }
    
    // Getters
    public Long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getSubject() {
        return this.subject;
    }
}

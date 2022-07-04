package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.dependency;

public class Professor {
    private Salary salary;
    
    public Professor(Salary _salary) {
        this.salary = _salary;
    }
    
    public void getProfessorSalary() {
        System.out.println("Professor salary: " + this.salary.getCurrency() + " " + this.salary.getAmount());
    }
}

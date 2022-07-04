package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.dependency;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Salary salary = new Salary();
        salary.setAmount(1000.0);
        salary.setCurrency("$");
        
        Professor pro = new Professor(salary);
        pro.getProfessorSalary();
    }
}

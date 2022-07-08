package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.program_to_an_interface;

import java.util.ArrayList;
import java.util.List;

public class Company {
    // Methods
    private List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());
        
        return employees;
    }
    
    public void createSoftware() {
        for (Employee employee : this.getEmployees()) {
            employee.doWork();
        }
        System.out.println("Totally, we have " + this.getEmployees().size() + " employees to work for website and mobile app.");
    }
}
